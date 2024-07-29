package training.iqgateway;
import java.sql.*;
public class JDBCSample {
    public static void main(String[] args) {
        // Stage 1 ---- Connect
        
        // Step A: ------- Register the driver
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded successfully...");
            
            //Step B: --------- Establishing the connection to Database
             con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "HR","HR");
            System.out.println("Connection established successfully.....");
            
            // Stage 2 -- Query
            // Step A: ----- Creating statement Object
            stmt = con.createStatement();
            
            //Step B: --- Executing the query
            String query = "select * from departments";
             rs = stmt.executeQuery(query);
            
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
                    stmt.close();
                    con.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
                }
    }
}
