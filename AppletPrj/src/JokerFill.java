import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class JokerFill extends Applet
{
	public void paint(Graphics g)
	{
		int[] x={100,150,200};
		int[] y={200,100,200};
		g.setColor(Color.blue);
		g.drawPolyline(x,y,3);           //Hat
		
		int xc=150,yc=240,r=64;
		g.setColor(Color.red);
		g.fillOval(xc-r,yc-r,2*r,2*r);      //Face
		
		g.setColor(Color.blue);
		g.drawArc(110,200,25,25,45,90);         //eyebrows
		g.drawArc(170,200,25,25,45,90);
		
		xc=120;
		yc=220;
		r=5;
		g.setColor(Color.green);
		g.fillOval(xc-r,yc-r,2*r,2*r);
		                                               //eyes
		xc=180;
		yc=220;
		r=5;
		g.fillOval(xc-r,yc-r,2*r,2*r);
		
		g.setColor(Color.gray);
		g.drawArc(145,230,10,30,90,225);                 //nose
		
		g.setColor(Color.yellow);
		g.drawArc(135,255,30,20,180,180);                //Smile
	}
}
//<applet code="JokerFill.class" width="500" height="500"></applet>