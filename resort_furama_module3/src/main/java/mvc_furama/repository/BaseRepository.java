package mvc_furama.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    private static final String URL ="jdbc:mysql://localhost:3306/furama";
    private static final String USER ="root";
    private static final String PASS ="123456";
public  static Connection getConnectDB(){
    Connection connection = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection(URL,USER,PASS);
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
    return connection;

}

}
