package JDBC;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


public class PerformDML {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String Username = "root";
        String Password = "911319911319";
        String Query = "UPDATE employees\n" +
                "SET job_title = 'Mern Stack', salary = 50000\n" +
                "WHERE id = 110;";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url, Username, Password);
            System.out.println("Connection Established Successfully");
            Statement stmt = con.createStatement();
            int rowsaffected = stmt.executeUpdate(Query);

            if(rowsaffected>0){
                System.out.println("Updation is Successfully "+rowsaffected +" rows(s)");
            }else{
                System.out.println("Updation is failed!!!");
            }

            con.close();
            stmt.close();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
