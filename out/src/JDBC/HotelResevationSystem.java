package JDBC;
//import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class HotelResevationSystem {

    private static final String url = "jdbc:mysql://localhost:3306/hotel_db";
    private static final String username = "root";
    private static final String password = "911319911319";

    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("Driver loaded successfull");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            while(true){
                System.out.println();
                System.out.println("HOTEL MANAGEMENT SYSTEM");
                System.out.println();
                Scanner sc = new Scanner(System.in);
                System.out.println("Press 1. Reserve a room");
                System.out.println("Press 2. View Resevation");
                System.out.println("Press 3. Get Room Number");
                System.out.println("Press 4. Update Reservation");
                System.out.println("Press 5. Cancel Resevation");
                System.out.println("Press 0. Exit");
                System.out.println("Choose an option: ");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        reserveRoom(con, sc);
                        break;
                    case 2:
                        viewReservation(con);
                        break;
                    case 3:
                        getroomNumber(con,sc);
                        break;
                    case 4:
                        updatereservation(con,sc);
                        break;
                    case 5:
                        deletereservation(con,sc);
                        break;
                    case 0:
                        exit();
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }

    private static void reserveRoom(Connection con , Scanner sc){
        try{
            System.out.println("Enter Guest Name: ");
            String guestName = sc.next();
            //sc.nextInt();

            System.out.println("Enter Room Number: ");
            int roomNumber = sc.nextInt();

            System.out.println("Enter Contact Number: ");
            String contactNumber = sc.next();

            String sql = "INSERT INTO reservation(guest_name,room_number,contact_number)"+
                    "VALUES('"+guestName+"',"+roomNumber+",'"+contactNumber+"')";

            try (Statement stmt = con.createStatement()){
               int affectedRows = stmt.executeUpdate(sql);

               if(affectedRows>0){
                   System.out.println("Reservation Successfull");
               }else{
                   System.out.println("Reservation failed, Try again");
               }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private static void viewReservation(Connection con) throws SQLException {
        String sql = "SELECT reservatin_id,guest_name,room_number,contact_number,reservation_date FROM reservation";

        try(Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql)){
            System.out.println("Your Reservation: ");
            System.out.println("------------------------------------------------------------------");
            System.out.println("RESERVATION ID | GUEST NAME | ROOM NUMBER | CONTACT NUMBER | DATE");
            System.out.println("-------------------------------------------------------------------");

            while(rs.next()){
               int reservationId = rs.getInt("reservatin_id");
               String guestname = rs.getString("guest_name");
               int roomnumber = rs.getInt("room_number");
               String contactnumber = rs.getString("contact_number");
               String reservationdate = rs.getTimestamp("reservation_date").toString();

                System.out.printf("%14d | %10s | %11d | %14s | %s\n", reservationId, guestname, roomnumber, contactnumber, reservationdate);            }

        }

    }

    private static void getroomNumber(Connection con, Scanner sc) {
        try {
            System.out.println("Enter Reservation ID: ");
            int reservationId = sc.nextInt();

            System.out.println("Enter Guest Name: ");
            String guestName = sc.next();

            String sql = "SELECT room_number FROM reservation " +
                    "WHERE reservatin_id = " + reservationId + " AND guest_name = '" + guestName + "'";

            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                if (rs.next()) {
                    int roomNumber = rs.getInt("room_number");
                    System.out.println("Room number for reservation ID " + reservationId +
                            " and Guest " + guestName + " is: " + roomNumber);
                } else {
                    System.out.println("Reservation not found for the given ID and guest name.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static boolean reservationExists(Connection con, int reservationId){
        try{
            String sql = "SELECT reservatin_id FROM reservation WHERE reservatin_id = "+reservationId;

            try(Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql)){
                return rs.next();
            }
        }catch (SQLException e){
            return false;
        }
    }



    private static void updatereservation(Connection con, Scanner sc){
        try {
            System.out.println("Enter reservation ID to update: ");
            int updateReservationId = sc.nextInt();

            if (!reservationExists(con, updateReservationId)) {
                System.out.println("Given reservation is wrong, Try Again");
                return;
            }

            System.out.println("Enter new guest name: ");
            String newGuestName = sc.nextLine();

            System.out.println("Enter new room number: ");
            int newRoomNumber = sc.nextInt();

            System.out.println("Enter your new contact number: ");
            String newContactNumber = sc.next();

            String sql = "UPDATE reservation SET guest_name = '" + newGuestName +
                    "', room_number = " + newRoomNumber + ", contact_number = '" + newContactNumber +
                    "' WHERE reservatin_id = " + updateReservationId;

            try (Statement stmt = con.createStatement()) {
                int affectedRows = stmt.executeUpdate(sql);

                if (affectedRows > 0) {
                    System.out.println("Update Successfully!!");
                } else {
                    System.out.println("Update Failed.");
                }
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
    }

    private static void deletereservation(Connection con,Scanner sc){
        try{
            System.out.println("Enter ID number for Delete Reservation: ");
            int deletereservation = sc.nextInt();

            if (!reservationExists(con,deletereservation)){
                System.out.println("Given ID Number is wrong!!!");
                return;
            }
            String sql = "DELETE FROM reservation WHERE reservatin_id ="+deletereservation;

            try(Statement stmt = con.createStatement()){
                int rowsaffected = stmt.executeUpdate(sql);

                if (rowsaffected>0){
                    System.out.println("Deletion Successfully!!!");
                }else{
                    System.out.println("Deletion Failed.");
                }

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void exit() throws InterruptedException{
        System.out.print("Existing System");
        int i= 5;
        while(i!=0){
            System.out.print(".");
            Thread.sleep(350);
            i--;
        }
        System.out.println();
        System.out.println("Thank You! For Using Hotel Reservation System!!!");
    }

}


