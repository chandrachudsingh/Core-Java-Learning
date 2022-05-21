import java.applet.Applet;
import java.awt.Graphics;

public class DrawCircle extends Applet
{
	public void paint(Graphics g)
	{
		int xc=100, yc=120, r=30;
		g.drawOval(xc-r ,yc-r, 2*r, 2*r);
	}
}

//<applet code="DrawCircle.class" width="300" height="300"></applet>
