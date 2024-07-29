//<applet code = Borderlayout1.java width=300 height=300></applet>
import java.awt.*;
import java.applet.*;
 class Borderlayout1 extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout());
		int i =0;
		add("North",new Button("Button" + i++));
		add("South",new Button("Button" + i++));
		add("East",new Button("Button" + i++));
		add("West",new Button("Button" + i++));
		add("Center",new Button("Button" + i++));
	}
}
