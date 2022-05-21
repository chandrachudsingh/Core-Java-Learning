import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class HutFill extends Applet
{
	public void paint(Graphics g)
	{
		int[] x={100,150,200};
		int[] y={200,100,200};
		g.setColor(Color.pink);
		g.fillPolygon(x,y,3);           //triangle
		
		g.setColor(Color.green);
		g.fillRect(100,200,100,200);    //lower part of triangle
		
		g.setColor(Color.black);
		g.fillRect(125,300,50,100);     //gate
		
		int[] xpoint={150,400,400,200};
		int[] ypoint={100,100,200,200};
		g.setColor(Color.yellow);
		g.fillPolygon(xpoint,ypoint,4);   //shed
		
		g.setColor(Color.red);
		g.fillRect(200,200,200,200);      //lower part of shed
		
		g.setColor(Color.blue);
		g.fillRect(250,275,100,50);       //window
	}
}
//<applet code="HutFill.class" width="800" height="800"></applet>