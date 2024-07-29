//<applet code = Gridlayout1.java width=300 height=300></applet>
import java.awt.*;
import java.applet.*;
public class Gridlayout1 extends Applet
{
	public void init()
	{
		setLayout(new GridLayout(7,3));
		for(int i=0;i<20;i++)
		add(new Button("Button" +i));
	}
}
