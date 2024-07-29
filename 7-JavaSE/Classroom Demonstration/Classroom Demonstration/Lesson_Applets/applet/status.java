//<applet code = status.class width = 400 height = 400></applet>
import java.awt.*;
import java.applet.*;
public class status extends Applet
{
	public void init()
	{
		setBackground(Color.cyan);
	}
	public void paint(Graphics g)
	{
		g.drawString("thisis in ther applet window",10,20);
		showStatus("this is shown in the status window");
	}
}
