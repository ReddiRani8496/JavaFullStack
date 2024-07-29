import java.net.*;
import java.io.*;

public class IP_info
{
	public static void main( String a[] ) throws Exception 
	{
		InetAddress ip = InetAddress.getByName( "yahoo.com" );

		System.out.println( ip );
		System.out.println( ip.getCanonicalHostName() );
		System.out.println( ip.getHostAddress() );
		System.out.println( ip.getHostName() + "\n\n" );

		InetAddress ip_arr [] = InetAddress.getAllByName( "yahoo.com" );

		for( int i =0; i < ip_arr.length; i++ )
			System.out.println( ip_arr[ i ] );			
	}
}