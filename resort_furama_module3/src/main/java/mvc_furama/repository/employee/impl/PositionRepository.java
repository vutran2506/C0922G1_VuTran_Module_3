package mvc_furama.repository.employee.impl;

import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;
import mvc_furama.model.employee.Position;
import mvc_furama.repository.BaseRepository;
import mvc_furama.repository.employee.IPositionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepository implements IPositionRepository {
    @Override
    public List<Position> getAllPosition() {
        List<Position> positionList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select* from positions");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("position_id");
                String name = resultSet.getString("name");
                Position position = new Position(id,name);
                positionList.add(position);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return positionList;
    }
}
