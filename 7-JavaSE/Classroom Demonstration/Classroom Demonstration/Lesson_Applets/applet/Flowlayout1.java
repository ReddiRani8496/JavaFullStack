
//<applet code = Flowlayout1.java width=300 height=300></applet>
import java.awt.*;
import java.applet.*;
public class Flowlayout1 extends Applet
{
	public void init()
	{
		setLayout(new FlowLayout());
		for(int i=0;i<20;i++)
		add(new Button("Button " + i));	
	}
}
