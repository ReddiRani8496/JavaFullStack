//<applet code = numvalues.class width= 400 height = 400></applet>
import java.awt.*;
import java.applet.*;
public class numvalues extends Applet
{
	public void paint(Graphics g)
	{
		int value1=10;
		int value2=20;
		int sum=value1+value2;
		String s= " sum:" +String.valueOf(sum);
		g.drawString(s,100,100);
	}
}
