import java.applet.Applet;
import java.awt.Graphics;

public class PolyLine extends Applet
{
	public void paint(Graphics g)
	{
		int[] x={150,200,250};
		int[] y={100,50,100};
		
		g.drawPolyline(x, y, 3);
	}
}
//<applet code="PolyLine.class" width="500" height="500"></applet>