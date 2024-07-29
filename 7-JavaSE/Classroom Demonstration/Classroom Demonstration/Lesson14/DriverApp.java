import java.sql.*;
import java.util.*;

class DriverApp
{
	public static void main (String args[]) 
	{
		try {
			Class.forName ("oracle.jdbc.driver.OracleDriver");
			Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
		}catch( Exception e ){	System.out.println( e );		}

		try{
			Enumeration drivers = DriverManager.getDrivers();
			System.out.println( "Following Drivers were found to be loaded\n" );
			
			Driver driver;
			
			while( drivers.hasMoreElements() )
			{
				driver = (Driver) drivers.nextElement();

				System.out.println( "Driver : " + driver.getClass().getName() );
				System.out.println( "Major Version : " + driver.getMajorVersion() );
				System.out.println( "Minor Version : " + driver.getMinorVersion() );
				System.out.println( "Is JDBC complaint : " + driver.jdbcCompliant() );
				
		System.out.println( "\n" );
	}
	}catch(Exception se ){	System.out.println( se );		}
	}
}
