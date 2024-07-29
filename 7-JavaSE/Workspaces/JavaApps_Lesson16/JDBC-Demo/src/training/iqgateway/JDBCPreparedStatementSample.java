package training.iqgateway;
import java.sql.*;
import java.util.Scanner;
public class JDBCPreparedStatementSample {
    public static void main(String[] args) {
        // Stage 1 ---- Connect
        
        // Step A: ------- Register the driver
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded successfully...");
            
            //Step B: --------- Establishing the connection to Database
             con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "HR","HR");
            System.out.println("Connection established successfully.....");
            
            // Stage 2 -- Query
            // Step A: ----- Creating Prepared statement Object
            String query = "select * from departments where department_id = ?";
            pstmt = con.prepareStatement(query);
            // Step B: -- supply value of ? [place holder] 
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter department id: ");
            int givenDeptId = sc.nextInt();
            pstmt.setInt(1,givenDeptId);
            
            //Step C: --- Executing the query
          
             rs = pstmt.executeQuery();
            
            // Stage 3: Processing the results
           // System.out.println(rs);
            while(rs.next()) {
                Integer deptId = rs.getInt(1);
                String deptName = rs.getString(2);
                Integer mgrId = rs.getInt(3);
                Integer locId = rs.getInt(4);
                System.out.println("Department Id: " + deptId + ", department name: " + deptName + ", manager Id: "+mgrId + ", location Id: "+locId);
            }
           
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            } catch(SQLException e) {
                e.printStackTrace();
                } finally {
            try {
                    rs.close();
                    pstmt.close();
                    con.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
                }
    }
}
