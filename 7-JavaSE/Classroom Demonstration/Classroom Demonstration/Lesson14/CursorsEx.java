import java.sql.*;

public class CursorsEx
{
	public static void main(String[] args) 
	{
		try
		{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println(" Driver Loaded Successfully");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@i3sn021e:1601:itrnd","user1","user1");
			System.out.println(" Connection Established Successfully..");

				Statement stat=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
				
				ResultSet rs=stat.executeQuery("select employee_id,last_name,email from employees");

				rs.afterLast();

				while(rs.previous())
				{
						System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t");
				}
				
				rs.close();
				stat.close();
				con.close();
		}
		catch(Exception e)
		{
			System.out.println(" Exception Raised ......" +e);
		}
	}
}
