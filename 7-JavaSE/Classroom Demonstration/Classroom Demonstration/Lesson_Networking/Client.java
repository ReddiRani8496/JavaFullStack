import java.io.*;
import java.net.*;

public class Client
 {
	    public static void main(String[] args) throws IOException
	 {

    		    Socket clientSocket;
   		     PrintStream out = null;
   		     BufferedReader in = null;

      		  try 
		{
          clientSocket = new Socket(InetAddress.getLocalHost(),95);
       out = new PrintStream(clientSocket.getOutputStream());
    	 in = new BufferedReader(new InputStreamReader (clientSocket.getInputStream()));
     		   } 
		catch (UnknownHostException e)
		 {
          			  System.err.println("Don't know about host.");
			    System.exit(1);
       		 }
		 catch (IOException e)
		 {
      		      System.err.println("Couldn't get I/O for the connection to:");
		    System.exit(1);
     		   }

                  BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
   		     String login=in.readLine();
    		    System.out.println(login);
			  String logname=stdin.readLine();
  		      out.println(logname);
		  String password=in.readLine();
      		  System.out.println(password);
		  String pass=stdin.readLine();
        		out.println(pass);
		   String str=in.readLine();
       		 System.out.println(str);

        
		while ((str=stdin.readLine()) != null) 
		{
		  	  out.println(str);
			    if (str.equals("Bye"))
				break;

           		 }
	

	out.close();
	in.close();
	stdin.close();
	
    }
}

