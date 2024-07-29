import java.net.*;
import java.io.*;

public class max_port
{
	public static void main( String a[] ) throws Exception 
	{
		ServerSocket ss = new ServerSocket( 2004 ,10000);
		Socket s = ss.accept();
	}
}