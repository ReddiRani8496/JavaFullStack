package training.iqgateway;
import java.sql.*;
import java.util.Scanner;
public class RetrieveOper {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded successfully...");
            
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "HR", "HR");
            System.out.println("Connection established successfully");
            
            String query = "select * from departments where department_id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter department id: ");
            Integer deptId = sc.nextInt();
            
            pstmt.setInt(1, deptId);
            
            ResultSet res = pstmt.executeQuery();
            
            while(res.next()) {
                Integer departmentId = res.getInt(1);
                String departmentName = res.getString(2);
                Integer managerId = res.getInt(3);
                Integer locationId = res.getInt(4);
                System.out.println("Department Id: " + departmentId + ", department name: " + departmentName + ", manager id: "+ managerId + ", location id: "+locationId);
            }
            
            res.close();
            pstmt.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not loaded");
            } catch(SQLException e){
                e.printStackTrace();
            }
    }
}
