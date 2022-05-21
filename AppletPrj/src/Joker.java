import java.applet.Applet;
import java.awt.Graphics;

public class Joker extends Applet
{
	public void paint(Graphics g)
	{
		int[] x={100,150,200};
		int[] y={200,100,200};
		g.drawPolyline(x,y,3);  
		
		int xc=150,yc=240,r=64;
		g.drawOval(xc-r,yc-r,2*r,2*r);
		
		g.drawArc(110,200,25,25,45,90);
		g.drawArc(170,200,25,25,45,90);
		
		xc=120;
		yc=220;
		r=5;
		g.drawOval(xc-r,yc-r,2*r,2*r);
		
		xc=180;
		yc=220;
		r=5;
		g.drawOval(xc-r,yc-r,2*r,2*r);
		
		g.drawArc(145,230,10,30,90,225);
		
		g.drawArc(135,255,30,20,180,180);
	}
}
//<applet code="Joker.class" width="500" height="500"></applet>