import java.net.*;
import java.io.*;

public class udp_sender
{
	public static void main( String a[] ) throws Exception 
	{
		DatagramSocket ds = new DatagramSocket(  );

		byte data[] = "This is the message to be sent".getBytes();
		InetAddress ip = InetAddress.getLocalHost();
		DatagramPacket dp = new DatagramPacket( data, data.length, ip, 2004 );

		ds.send( dp );

		ds.close();		
	}
}