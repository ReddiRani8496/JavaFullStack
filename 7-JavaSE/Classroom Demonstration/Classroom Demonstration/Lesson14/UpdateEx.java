import java.sql.*;

public class UpdateEx
{
	public static void main(String[] args) 
	{
		try
		{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				System.out.println(" Connecting to DataBase....... ");

				Connection con=DriverManager.getConnection("jdbc:odbc:AuthoriaAccessDSN");

			//	con.setAutoCommit(false);

				System.out.println(" Connected to the Database.");

				Statement stat=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				
				ResultSet rs=stat.executeQuery("select AuthoriaEmp.* from AuthoriaEmp");

				rs.first();

				rs.updateString(1,"Ravi");
				
				rs.updateRow();
				System.out.println(" Single Row Updated ...");


				
				
				rs.close();
				stat.close();
				con.close();
		}
		catch(Exception e)
		{
			System.out.println(" Exception Raised ......" +e);
			e.printStackTrace();
		}
	}
}
