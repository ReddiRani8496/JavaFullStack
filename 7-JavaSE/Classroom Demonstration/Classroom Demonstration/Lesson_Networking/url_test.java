import java.net.*;
import java.io.*;
import java.util.*;

public class url_test
{
	public static void main( String a[] ) throws Exception 
	{
		URL url = new URL( "http://www.stepindia.com/" );

		System.out.println( url );
		System.out.println( url.getDefaultPort() );
		System.out.println( url.getPort() );
		System.out.println( url.getFile() );
		System.out.println( url.getHost() );
		System.out.println( url.getProtocol() );
		System.out.println( url.toExternalForm() + "\n\n");
//---------------------------------------------------------------
		URLConnection urc = url.openConnection();
		System.out.println( urc.getContentLength() );
		System.out.println( urc.getContentEncoding() );
		System.out.println( urc.getContentType() );
		System.out.println( urc.getDate() );
		System.out.println( urc.getExpiration() );
		System.out.println( urc.getLastModified() );
//---------------------------------------------------------------
		Map map = urc.getHeaderFields();
		Set set = map.keySet();
		Object arr[] = set.toArray();
		for( int i = 0; i < arr.length; i++ )
			System.out.println( (String) arr[ i ] + "..." + map.get( arr[ i ] ) );
/*
		InputStream is = url.openStream();
		byte b[] = new byte[ urc.getContentLength() ];

		is.read( b );
		System.out.println( new String( b ) );
		is.close();
*/
	}
}