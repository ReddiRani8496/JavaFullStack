import java.sql.*;

public class Updates
{
	public static void main(String[] args) 
	{
		try
		{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				System.out.println(" Connecting to DataBase....... ");

				Connection con=DriverManager.getConnection("jdbc:odbc:MyDataSource","sa","");

				System.out.println(" Connected to the Database.");

				Statement stat=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				
				ResultSet rs=stat.executeQuery("select Prodid,ProdName,Price from Product");

				rs.last();

				rs.updateDouble("Price",99);
				rs.updateRow();
				System.out.println(" Single Row Updated ...");
								
		}
		catch(Exception e)
		{
			System.out.println(" Exception Raised ......" +e);
		}
	}
}
