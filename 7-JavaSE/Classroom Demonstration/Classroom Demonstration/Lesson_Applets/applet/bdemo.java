//<applet code =bdemo.class width = 400 height=400></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class bdemo extends Applet implements ActionListener
{
	String msg="";
	Button yes,no,maybe;
	public void init()
	{
		yes  = new Button("yes");
		no  = new Button("no");
		maybe = new Button("maybe");
		add(yes);
		add(no);
		add(maybe);
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("yes"))
		{
			msg="u pressed yes.";
		}
		else if(str.equals("no"))
		{
			msg="u pressed no";
		}
		else
		{
			msg="u pressed undecided.";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,6,100);
	}
		
}
