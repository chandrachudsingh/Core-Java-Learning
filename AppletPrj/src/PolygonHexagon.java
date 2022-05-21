import java.applet.Applet;
import java.awt.Graphics;

public class PolygonHexagon extends Applet 
{
	public void paint(Graphics g)
	{
		int[] x={150,200,250,300,250,200};
		int[] y={100,50,50,100,150,150};
		
		// Polygon P=new PolygonHexagon(x, y, 6);
		
		// g.drawPolygon(P);
		g.drawPolygon(x, y, 6);
	}
}
//<applet code="PolygonHexagon.class" width="500" height="500"></applet>
	