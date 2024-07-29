//<applet code = Applet4.java width=300 height=300></applet>
import java.awt.*;
import java.applet.*;
public class Applet4 extends Applet
{
	Button b1 = new Button("Button1 ");
	Button b2 = new Button("Button2 ");
	public void init()
	{
		add(b1);
		add(b2);
	}
		

	public void paint(Graphics g)
	{
		//add(b1);
		//add(b2);
		g.drawString("second applet",10,15);
	}
}
