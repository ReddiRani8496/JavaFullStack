//<applet code = face.class width= 400 height = 400></applet>
import java.awt.*;
import java.applet.*;
public class face extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.pink);
		g.drawOval(40,40,120,150);//head
		g.drawOval(57,75,30,20);//left eye
		g.drawOval(110,75,30,20);// right eye
		g.setColor(Color.BLUE);
		g.fillOval(68,81,10,10);//pupil (left)
		g.fillOval(121,81,10,10);//pupil (right)
		g.drawOval(85,100,30,30);//nose
		g.fillArc(60,125,80,40,180,180);//mouth
		g.drawOval(25,92,15,30);//left ear
		g.drawOval(160,92,15,30);//right ear
	}
}
