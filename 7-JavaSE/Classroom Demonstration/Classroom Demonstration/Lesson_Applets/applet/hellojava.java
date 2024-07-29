<applet code = hellojava.class width= 500 height = 500 ></applet>
import java.awt.*;
import java.applet.*;
public class hellojava extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("hello java",10,100);
	}
}
