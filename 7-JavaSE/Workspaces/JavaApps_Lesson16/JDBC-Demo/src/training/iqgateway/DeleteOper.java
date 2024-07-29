package training.iqgateway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class DeleteOper {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded successfully...");
            
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "HR", "HR");
            System.out.println("Connection established successfully");
            
            String query = "delete from  departments   where department_id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter department id: ");
            Integer deptId = sc.nextInt();
            
            pstmt.setInt(1, deptId);
            
            pstmt.executeUpdate();
        
            pstmt.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not loaded");
            } catch(SQLException e){
                e.printStackTrace();
            }
    }
}
