
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class tdemo extends Applet implements ActionListener
{
	TextField name,pass;
	public void init()
	{
		Label namep = new Label("Name:" ,Label.RIGHT);
		name=new TextField(12);	
		Label passp = new Label("password:" ,Label.RIGHT);
		pass=new TextField(8);	
		pass.setEchoChar('*');
		add(namep);
		add(passp);
		add(name);
		add(pass);
		name.addActionListener(this);
		pass.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Name : " + name.getText(),6,60);
		g.drawString("selected text in name:"+name. ),6,80);
		g.drawString("password : " + pass.getText(),6,100);
	}	
}
