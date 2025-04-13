package JDBC;
import java.sql.*;

public class Transaction_Handling {
    public static void main(String[] args)throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/bank";
        String username = "root";
        String password = "911319911319";
        String withdraw = "UPDATE bank_employees SET balance = balance + ? WHERE accname = ? ";
        String deposit = "UPDATE bank_employees SET balance = balance - ? WHERE accname = ?";


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded!!");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection established successfully!!!!");
            con.setAutoCommit(false);
            try {


                PreparedStatement withdrawstmt = con.prepareStatement(withdraw);
                PreparedStatement depositstmt = con.prepareStatement(deposit);

                withdrawstmt.setDouble(1, 500);
                withdrawstmt.setString(2, "acc123");

                depositstmt.setDouble(1, 500);
                depositstmt.setString(2, "acc456");
                int rowsaffectedwithdraw = withdrawstmt.executeUpdate();
                int rowsaffecteddeposite = depositstmt.executeUpdate();
                if(rowsaffectedwithdraw>0 && rowsaffecteddeposite>0){
                    con.commit();
                    System.out.println("Transaction Successfully!!!!");
                }else{
                    con.rollback();
                    System.out.println("Transaction Failed!!!");
                }

            }catch (SQLException e){

                System.out.println(e.getMessage());
            }

        }catch (SQLException e){

            System.out.println(e.getMessage());
        }
    }
}
