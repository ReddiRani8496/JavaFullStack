//<applet code = "testapplet.java" width = 400 height = 400 ></applet>
import java.awt.*;
import java.applet.*;
import java.util.Date;
public class testapplet extends Applet implements Runnable
{
	Thread t = null;
	String s = "";
	public void init()
	{
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
			try
			{
				s = new Date().toString();
				repaint();
				t.sleep(1000);
			}
			catch(Exception e){}
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(s,15,15);
	}
}
