//<applet code =MousepressedDemo.class width=400 height=200></applet>
import java.awt.*;
//<applet code =MousepressedDemo.class width=400 height=200></applet>
import java.awt.event.*;
import java.applet.Applet;
public class MousepressedDemo extends Applet
{
	public void init()
	{
		addMouseListener(new mymouseadapter(this));
	}
}
class mymouseadapter extends MouseAdapter
{
	MousepressedDemo mousepresseddemo;
	public mymouseadapter(MousepressedDemo mousepresseddemo)
	{
		this.mousepresseddemo=mousepresseddemo;
	}
	public void mousePressed(MouseEvent e)
	{
		mousepresseddemo.showStatus("mousepressed");
	}
}


