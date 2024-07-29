import java.net.*;
import java.io.*;

public class tcp_client
{
	public static void main( String a[] ) throws Exception 
	{
		Socket s = new Socket( "localhost", 2004 );

		OutputStream os = s.getOutputStream();
		os.write( "Message.. How R U".getBytes() );

		os.flush();
		s.close();
	}
}