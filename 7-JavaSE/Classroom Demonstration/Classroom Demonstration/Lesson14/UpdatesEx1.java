import java.sql.*;

public class UpdatesEx1
{
	public static void main(String[] args) 
	{
		try
		{
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				System.out.println(" Connecting to DataBase....... ");

				Connection con=DriverManager.getConnection("jdbc:odbc:AuthoriaAccessDSN");

				System.out.println(" Connected to the Database.");

				Statement stat=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				
				ResultSet rs=stat.executeQuery("select * from AuthoriaEmp");

				rs.moveToInsertRow();
				rs.updateString(1,"Sunil Raju");
				rs.updateInt(2,234);
				rs.updateString(3,"Bangalore");
				rs.updateInt(4,567890);

				rs.insertRow();
				System.out.println(" Single Row Inserted ...");
								
		}
		catch(Exception e)
		{ 
			System.out.println(" Exception Raised ......" +e);
		}
	}
}
