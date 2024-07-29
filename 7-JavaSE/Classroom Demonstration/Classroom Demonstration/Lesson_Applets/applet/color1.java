
import java.awt.*;
import java.applet.*;
public class color1 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(20,20,200,120);
		g.setColor(Color.green);
		g.fillOval(70,30,100,100);
	}
}
