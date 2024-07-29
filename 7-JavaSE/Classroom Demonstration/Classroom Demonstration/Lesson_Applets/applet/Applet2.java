//<applet code = Applet2.java width=300 height=300></applet>
import java.awt.*;
import java.applet.*;
public class Applet2 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("second applet",10,15);
		g.draw3DRect(0,0,100,20,true);
	}
}
