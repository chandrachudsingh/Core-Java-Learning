import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class DrawCocentricCircleScr extends Applet
{
		
	public void paint(Graphics g)
	{	
		int w=this.getSize().width,h=this.getSize().height;    /*refreshes the screen,
		                                                         so paint executes*/
		int xc=w/2,yc=h/2,r=w/16;
		for(int i=1;i<=5;i++)
		{
		    setForeground(Color.green);
			g.drawOval(xc-r ,yc-r , 2*r , 2*r);
			r+=w/32;
		}
	}
}

//<applet code="ColoredCocentricCircleScr.class" width="300" height="300"></applet>
