//<applet code = bases width = 400 height = 400></applet>
import java.awt.*;
import java.applet.*;
import java.net.*;
public class bases extends Applet
{
	public void paint(Graphics g)
	{
		String msg;
		URL url=getCodeBase();
		msg="code base:"+url.toString();
		g.drawString(msg,10,20);
		url=getDocumentBase();
		msg="document base:"+url.toString();
		g.drawString(msg,10,40);
	}
}
