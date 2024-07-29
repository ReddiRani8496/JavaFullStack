import java.sql.*;

public class CursorsEx1
{
	public static void main(String[] args) 
	{
		try
		{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				System.out.println(" Connecting to DataBase....... ");

				Connection con=DriverManager.getConnection("jdbc:odbc:MyDataSource","sa","");

				System.out.println(" Connected to the Database.");

				Statement stat=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
				
				ResultSet rs=stat.executeQuery("select * from  publishers");

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
