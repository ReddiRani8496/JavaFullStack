import java.net.*;
import java.io.*;

public class Server extends Thread 
{
    
        ServerSocket serverSocket ;
	  public Server()
	  {
              		  try
       		  {
            			serverSocket = new ServerSocket(95);
			System.out.println(serverSocket.toString());
      		  }
       		  catch (IOException e) 
      		  {
            			System.out.println("Could not start server");
           		 }
		  System.out.println("server started...");
		  this.start();

	   }

	 public void run()
	{
		try
		{
			while(true)
			{
				Socket client=serverSocket.accept();
				Connection con=new Connection(client);
			}
 
		}
		catch(IOException e)
		{
		}
	}

	public static void main(String str[]) 
	{
		new Server();
	}
}	


class Connection extends Thread
{
    protected Socket netclient;
	protected BufferedReader fromclient;
	protected PrintStream toclient;
	
	public Connection(Socket client)
	{
		netclient=client;
		try
		{
		fromclient= new BufferedReader(new InputStreamReader(netclient.getInputStream()));
       	toclient=new PrintStream(netclient.getOutputStream());
		}
		catch(IOException e)
		{
		}
		this.start();
	}
	public void run()
	{
		String login,password;
		try
		{
			for(;;)
			{
				toclient.println("login: ");
				login=fromclient.readLine();
				if((login==null)||(login.equals("Bye")))
				 {
				           System.out.println("quiting");
					return;
				}
				else
				{
					System.out.println(login+ "login in");
				}
				toclient.println("password");
				password=fromclient.readLine();
				System.out.println(password);
			}
		}
		catch(IOException e)
		{ }
		finally
		{
			try
			{
				netclient.close();
			}
			catch(IOException e)
			{}
		}
	}
}
 