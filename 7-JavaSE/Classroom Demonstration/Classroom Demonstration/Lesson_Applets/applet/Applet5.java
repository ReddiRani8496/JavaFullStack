//<applet code = Applet5.java width=300 height=300></applet>
import java.awt.*;
import java.applet.*;
public class Applet5 extends Applet
{
	Button b1 = new Button("Button1 ");
	Button b2 = new Button("Button2 ");
	public void init()
	{
		add(b1);
		add(b2);
	}
		

	public boolean action (Event e ,Object o)
	{
		if(e.target.equals(b1))
		//getAppletContext().showStatus("button1");
		System.exit(0);
		else if(e.target.equals(b2))
		getAppletContext().showStatus("button2 ");
		else 
		return super.action(e,o);
		return true;
	}
}
