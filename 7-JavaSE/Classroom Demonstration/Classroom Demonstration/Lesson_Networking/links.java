import java.applet.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class links extends Applet implements ActionListener
{
	java.awt.List links;
	Button browse;

	public links()
	{
		links = new java.awt.List(  );

		links.add("step India home page" );
		links.add("sun microsystems home page" );

		browse = new Button( "Browse" );
		browse.addActionListener( this );

		add( links );
		add( browse );
	}
	public void actionPerformed( ActionEvent ae )
	{
		AppletContext context = getAppletContext();

		try{
			if( links.getSelectedIndex() == 0 )
				context.showDocument( new URL( "http://www.stepindia.com")  );
			else
				context.showDocument( new URL( "http://www.java.sun.com" ) );
		}catch( Exception e ){	System.out.println( e );	}
	}
}