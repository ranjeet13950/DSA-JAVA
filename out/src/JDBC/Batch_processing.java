package JDBC;
import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Batch_processing {
    public static void main(String[] args)throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "911319911319";


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully!!!");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection established!!!");
            String sql = "INSERT INTO employees(name,job_title,salary)VALUES(?,?,?)";
            PreparedStatement prestmt = con.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Job Title: ");
                String job_title = sc.nextLine();
                System.out.println("Salary: ");
                Double salary = sc.nextDouble();

                prestmt.setString(1,name);
                prestmt.setString(2,job_title);
                prestmt.setDouble(3,salary);
                prestmt.addBatch();
                System.out.println("Add More Values: Y/N");
                String decision = sc.nextLine();
                if (decision.toUpperCase().equals("N")){
                    break;
                }
            }
            int [] batchresult = prestmt.executeBatch();
            con.commit();
            System.out.println("Batch Execute successfully!!!");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
