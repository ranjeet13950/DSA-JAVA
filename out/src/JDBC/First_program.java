package JDBC;
import java.sql.*;

public class First_program {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String Username = "root";
        String Password = "911319911319";
        String query="Select * from employees;";

        //Driver Loading
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
        }catch (ClassNotFoundException e){
            System.err.println(e.getMessage());
        }


        //Connection Establishing
        try{
            Connection con = DriverManager.getConnection(url, Username, Password);
            System.out.println("Connection Established SuccessFully");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                Double salary = rs.getDouble("salary");
                System.out.println();
                System.out.println("=======================");
                System.out.println("ID: "+id);
                System.out.println("Name: "+name);
                System.out.println("Job title: "+job_title);
                System.out.println("Salary: "+salary);
            }
            con.close();
            stmt.close();
            rs.close();
            System.out.println("Connection Closed SuccessFully");


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
