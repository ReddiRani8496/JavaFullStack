package training.iqgateway;
import java.sql.*;
import java.util.Scanner;
public class CreateOper {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded successfully...");
            
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "HR", "HR");
            System.out.println("Connection established successfully");
            
            String query = "insert into Departments(department_id, department_name, manager_id, location_id)  values(?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter department id: ");
            Integer deptId = sc.nextInt();
            System.out.println("Enter department name: ");
            String deptName = sc.next();
            System.out.println("Enter manager id: ");
            Integer mngId = sc.nextInt();
            System.out.println("Enter location id: ");
            Integer locId = sc.nextInt();
            
            
            pstmt.setInt(1, deptId);
            pstmt.setString(2, deptName);
            pstmt.setInt(3, mngId);        
            pstmt.setInt(4, locId);
            
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
