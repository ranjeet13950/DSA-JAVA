package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectToJDBC {
    public static void main(String[] args) {
        //Database URL
        String url = "jdbc:mysql://localhost:3306/college";
        //Database credentials
        String username = "root";
        String password = "911319911319";

        //Establish the connection
        try (Connection connection = DriverManager.getConnection(url,username,password)){
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            System.out.println("Connection failed: "+ e.getMessage());
        }
    }
}
