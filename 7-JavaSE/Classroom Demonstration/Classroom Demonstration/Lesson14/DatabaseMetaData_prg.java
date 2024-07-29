import java.sql.*;

public class DatabaseMetaData_prg
{
	public static void main( String args[] )
	{
		try{
			Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
		}catch( Exception e ){	System.out.println( e );	}
		try{
			Connection con = DriverManager.getConnection( "jdbc:odbc:MyDataSource");

			DatabaseMetaData meta_data = con.getMetaData();

			System.out.println( "Database : " + meta_data.getDatabaseProductName() );
			System.out.println( "Version : " + meta_data.getDatabaseProductVersion() );

			System.out.println( "User name : " + meta_data.getUserName() );
			
			System.out.println( "URL : " + meta_data.getURL() );
			
			System.out.println( "Driver name : " + meta_data.getDriverName() );
			
			System.out.println( "Driver version : " + meta_data.getDriverVersion() );
			
			System.out.println( "Driver Major version : " + meta_data.getDriverMajorVersion() );
			
			System.out.println( "Driver Minor version : " + meta_data.getDriverMinorVersion() );
			
			System.out.println( "Uses local files : " + meta_data.usesLocalFiles() );
			
			System.out.println( "Keyword list : " + meta_data.getSQLKeywords() );
			con.close();			
		}catch( Exception e ){	System.out.println( e );	}
	}
}

