//<applet code = Border.class width = 400 height = 400></applet>
import java.awt.*;
import java.applet.*;
import java.util.*;
public class Border extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout());
		add(new Button("this is across the top"),BorderLayout.NORTH);
		add(new Label("new lable"), BorderLayout.SOUTH); 
		add(new Button("right"),BorderLayout.EAST); 
		add(new Button("left"),BorderLayout.WEST);
		String msg="see the button";
		add(new TextArea(msg),BorderLayout.CENTER);
	}
}
