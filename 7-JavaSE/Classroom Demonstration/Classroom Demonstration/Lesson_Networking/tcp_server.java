import java.net.*;
import java.io.*;

public class tcp_server
{
	public static void main( String a[] ) throws Exception 
	{
		ServerSocket ss = new ServerSocket( 2004 );

System.out.println( "Server is now ready to accept requests" );
		Socket s = ss.accept();
System.out.println( "Client request was accepted" );

		InputStream is =  s.getInputStream();

		int ch;

		while( (ch = is.read() ) != -1)
			System.out.print( (char) ch );
		is.close();

		is.close();
		s.close();
		ss.close();
	}
}