package management_user.repository;

import management_user.model.Users;

import java.util.List;

public interface IUserRepository {
    List<Users> selectAllUser();

    Users selectById(int id);

    boolean insertUser(Users users);

    boolean updateUser(int id, Users users);

    boolean deleteUser(int id);
    List<Users> sortByNameUser();
    List<Users> searchByCountry(String country);

}
