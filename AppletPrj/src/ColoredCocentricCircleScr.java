import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class ColoredCocentricCircleScr extends Applet
{
		
	public void paint(Graphics g)
	{	
		int w=this.getSize().width,h=this.getSize().height;    /*refreshes the screen,
		                                                         so paint executes*/
		int xc=w/2,yc=h/2,r=w/16;
		
		Color C=null;
		
		for(int i=0;i<=4;i++)
		{
			//C=new Color((xc+r)%255,(yc+r)%255,(xc+yc+r)%255);
			C=new Color((int)(Math.random()*1000)%255,(int)(Math.random()*1000)%255,(int)(Math.random()*1000)%255);
			g.setColor(C);

			g.drawOval(xc-r ,yc-r , 2*r , 2*r);
			r+=w/32;
		}
	}
}

//<applet code="ColoredCocentricCircleScr.class" width="300" height="300"></applet>
