import java.applet.Applet;
import java.awt.Graphics;

public class Hut extends Applet
{
	public void paint(Graphics g)
	{
		int[] x={100,150,200};
		int[] y={200,100,200};
		g.drawPolygon(x,y,3);           //triangle
		
		g.drawRect(100,200,100,200);    //lower part of triangle
		
		g.drawRect(125,300,50,100);     //gate
		
		int[] xpoint={150,400,400,200};
		int[] ypoint={100,100,200,200};
		g.drawPolygon(xpoint,ypoint,4);   //shed
		
		g.drawRect(200,200,200,200);      //lower part of shed
		
		g.drawRect(250,275,100,50);       //window
	}
}
//<applet code="Hut.class" width="800" height="800"></applet>