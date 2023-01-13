package students.repository.impl;

import com.mysql.cj.protocol.ResultsetRow;
import students.model.Clazz;
import students.repository.IClazzRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


public class ClazzRepository implements IClazzRepository {

    @Override
    public List<Clazz> findByAll() {
        List<Clazz> clazzList= new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select* from clazz;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int class_id = resultSet.getInt("class_id");
                String class_name = resultSet.getString("class_name");
                Clazz clazz = new Clazz(class_id,class_name);
                clazzList.add(clazz);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clazzList;
    }
}
