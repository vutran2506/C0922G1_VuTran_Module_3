package management_user.repository.impl;

import management_user.model.User;
import management_user.repository.IUserRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UseRepository implements IUserRepository {
    private final String SELECT_ALL = "call selectAll()";
    private final String SELECT_BY_ID = "select id,name,email,country from users where id =?";
    private final String UPDATE_USER = "call editUser(?,?,?,?)";
    private final String DELETE_USER = "call deleteUser(?)";
    private final String INSERT_USER = "call insertUser(?,?,?)";

    @Override
    public List<User> selectAllUser() {
        List<User> users = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(SELECT_ALL);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                User user = new User(id, name, email, country);
                users.add(user);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    @Override
    public User selectUser(int id) {
        User user = null;
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(SELECT_BY_ID);
            callableStatement.setInt(1, id);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id, name, email, country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean insertUser(User user) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(INSERT_USER);
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            return callableStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUser(int id, User user) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(UPDATE_USER);
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            callableStatement.setInt(4, user.getId());
            return callableStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(DELETE_USER);
            callableStatement.setInt(1,id);
            return callableStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public void addUserTransaction(User user, int[] permisions) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;

        ResultSet resultSet = null;
        try {
            connection = BaseRepository.getConnectDB();

            connection.setAutoCommit(false);

            preparedStatement = connection.prepareStatement(INSERT_USER, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, user.getName());

            preparedStatement.setString(2, user.getEmail());

            preparedStatement.setString(3, user.getCountry());

            int rowAffected = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();

            int userId = 0;
            if (resultSet.next())

                userId = resultSet.getInt(1);

            if (rowAffected == 1) {
                String sqlPivot = "INSERT INTO user_permision(user_id,permision_id) " + "VALUES(?,?)";
                preparedStatement1 = connection.prepareStatement(sqlPivot);

                for (int permisionId : permisions) {

                    preparedStatement1.setInt(1, userId);

                    preparedStatement1.setInt(2, permisionId);

                    preparedStatement1.executeUpdate();
                }
                connection.commit();
            } else {
                connection.rollback();
            }
        } catch (SQLException e) {
          e.printStackTrace();
        }

    }

}

