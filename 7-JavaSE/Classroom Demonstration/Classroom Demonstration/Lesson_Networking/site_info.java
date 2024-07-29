import java.net.*;
import java.io.*;

public class site_info
{
	public static void main( String a[] ) throws Exception 
	{
 
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();

		os.write( "stepindia.com".getBytes() );

		int ch;
		while( ( ch = is.read() ) != -1 )
			System.out.print( (char) ch );

		s.close();
	}
}