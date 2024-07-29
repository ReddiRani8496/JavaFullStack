//<applet code =ldemo.class width = 400 height=400></applet>
import java.awt.*;
import java.applet.*;
public class ldemo extends Applet
{
	public void init()
	{
		Label l1 = new Label("one");
		Label l2 = new Label("two");
		Label l3 = new Label("three");
		add(l1);
		add(l2);
		add(l3);
	}
}
