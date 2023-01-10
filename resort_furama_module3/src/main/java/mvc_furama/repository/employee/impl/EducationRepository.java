package mvc_furama.repository.employee.impl;

import mvc_furama.model.employee.Education;

import mvc_furama.repository.BaseRepository;
import mvc_furama.repository.employee.IEducationRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationRepository implements IEducationRepository {
    @Override
    public List<Education> getAllEducation() {
        List<Education> educationList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from education_degree");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("education_degree_id");
                String name = resultSet.getString("name");
                Education education = new Education(id, name);
                educationList.add(education);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return educationList;
    }
}

