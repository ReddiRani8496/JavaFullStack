import java.sql.*;

public class ResultSetMetaData_prg
{
	public static void main( String args[] )
	{
		try{
			Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
		}catch( Exception e ){	System.out.println( e );	}

		try{
			Connection con = DriverManager.getConnection( "jdbc:odbc:MyDataSource");
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery( "select * from employees" );

			ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println( "Table name : " + rsmd.getTableName(1));
			System.out.println( "Read Only : " + rsmd.isReadOnly(1));
			System.out.println( "Writable : " + rsmd.isWritable( 1 ) );
			System.out.println( "No. of Columns : " + rsmd.getColumnCount() + "\n\n" );
			for( int i =1; i <= rsmd.getColumnCount();  i++ )
			{
					System.out.print( rsmd.getColumnName( i ) + "  |  " +"\t"+ rsmd.getColumnTypeName(i)+" | " + "\t");
				
			}
			System.out.println( "\n\n" );
		

			while( rs.next() )
			{
				for( int i =1; i<= rsmd.getColumnCount();  i++ )
				{
					if( i < rsmd.getColumnCount() )
						System.out.print( rs.getString( i ) + "  |  " );
					else
						System.out.println( rs.getString( i ) );
				}
			}

			con.close();
			
		}catch( Exception e ){	System.out.println( e );	}
	}
}
