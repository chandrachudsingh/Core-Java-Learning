import java.applet.Applet;
import java.awt.Graphics;

public class DrawCocentricCircle extends Applet
{
		
	public void paint(Graphics g)
	{	
		int xc=200,yc=200,r=20;
		for(int i=1;i<=5;i++)
		{
			g.drawOval(xc-r ,yc-r , 2*r , 2*r);
			r+=5;
		}
	}
}

//<applet code="DrawCocentricCircle.class" width="300" height="300"></applet>
