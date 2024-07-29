//<applet code = Applet3.java width=300 height=300></applet>
import java.awt.*;
import java.applet.*;
public class Applet3 extends Applet
{
	String s;
	int inits=0;
	int starts=0;
	int stops=0;
	public void init(){inits++;}
	public void start(){starts++;}
	public void stop(){stops++;}	

	public void paint(Graphics g)
	{
		g.drawString("second applet",10,15);
		g.draw3DRect(0,0,100,20,true);
		s= "inits:"+inits+"starts:"+starts+"stop:"+stops;
		g.drawString(s,50,50);
	}
}
