import java.net.*;
import java.io.*;

public class udp_receiver
{
	public static void main( String a[] ) throws Exception 
	{
		DatagramSocket ds = new DatagramSocket( 2004 );

		byte b[] = new byte[ ds.getReceiveBufferSize() ];
		DatagramPacket dp = new DatagramPacket( b, b.length );

System.out.println( "This application is now ready to receive data" );
		ds.receive( dp );
System.out.println( "data was received" );

		String msg = new String( dp.getData() );
		msg = msg.substring( 0, dp.getLength() );

		System.out.println( "Message received :  " + msg );

		ds.close();		
	}
}