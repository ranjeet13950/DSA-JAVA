package JDBC;
import java.sql.*;

public class UpdateData {
    public static void main(String[] args)throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String Username = "root";
        String Password = "911319911319";
     // String Query = "INSERT INTO employees(id,name,job_title,salary)VALUE(110,'sonu','devops',90000)";  //FOR INSERTION
        String Query = "DELETE FROM employees WHERE id = 101;";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, Username, Password);
            System.out.println("Connection Established Successfully");
            Statement stmt = con.createStatement();
            //
            // Perform DML
            int rowsaffected = stmt.executeUpdate(Query);

            if (rowsaffected>0){
                System.out.println("DELETION Successfull "+rowsaffected+" row(s) affected.");
            }else{
                System.out.println("DELETION failed!!!");
            }

            con.close();
            stmt.close();

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

}
