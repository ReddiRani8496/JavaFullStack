package training.iqgateway;
import java.util.Scanner;
import java.sql.*;
public class UpdateOper {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded successfully...");
            
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "HR", "HR");
            System.out.println("Connection established successfully");
            
            String query = "update  departments set department_name = ?  where department_id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the department name: ");
            String deptName = sc.next();
            System.out.println("Enter department id: ");
            Integer deptId = sc.nextInt();
            
            pstmt.setString(1, deptName);
            pstmt.setInt(2, deptId);
            
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
