package JDBC;
import java.sql.*;
import java.util.Scanner;

public class prepared_statement {
    public static void main(String[] args)throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "911319911319";
        String query="INSERT INTO employees(id,name,job_title,salary) VALUES(?,?,?,?)";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection success");

            PreparedStatement prestmt = con.prepareStatement(query);
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Insert name: ");
            String name = sc.nextLine();

            System.out.println("Insert Job Title: ");
            String job_title = sc.nextLine();
            System.out.println("Insert Salary: ");
            Double salary = sc.nextDouble();


            prestmt.setInt(1,id);
            prestmt.setString(2,name);
            prestmt.setString(3,job_title); 
            prestmt.setDouble(4,salary);


            int affectedrows = prestmt.executeUpdate();
            if (affectedrows>0){
                System.out.println("Insertion successfully!!!!");
            }else{
                System.out.println("Insertion Failed!!!");
            }
            //For retrieve the data
//            ResultSet rs = prestmt.executeQuery();
//            while(rs.next()){
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String job_title = rs.getString("job_title");
//                double salary = rs.getDouble("salary");
//
//                System.out.println("ID: "+id);
//                System.out.println("Name: "+name);
//                System.out.println("Job Title: "+job_title);
//                System.out.println("Salary: "+salary);
//            }


            //rs.close();
            prestmt.close();
            con.close();


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
