import java.sql.*;

public class TransactionExample
{
	static Connection con=null;
	public static void main(String[] args) 
	{
		try
		{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				System.out.println(" Connecting to DataBase....... ");

				 con=DriverManager.getConnection("jdbc:odbc:MyDataSource","sa","");

				System.out.println(" Connected to the Database.");
				con.setAutoCommit(false);
				Statement stat=con.createStatement();
				
				stat.executeUpdate("insert into Customer values (11,'ORACLE', 'Bangalore')");


/*				Statement stat1=con.createStatement();

				ResultSet rs=stat1.executeQuery("select stock_on_hand from Product where Prodid=103");

				rs.next();
				int i=rs.getInt(1);

				i=i-1;

				Statement stat2=con.createStatement();

				stat2.executeUpdate(" update Product set stock_on_hand = " + i + " where Prodid =103");*/

				con.commit();

				System.out.println(" Changes are Commited ");

				

//				rs.close();
				stat.close();
				//stat1.close();
				//stat2.close();
				
				//con.close();
		}
		catch(Exception e)
		{

			System.out.println(" Exception Raised ......" +e);
			/*try
			{
				con.rollback();
			}
			catch(Exception e1)
			{
				System.out.println(" sdf");
			}*/
		}
	}
}
