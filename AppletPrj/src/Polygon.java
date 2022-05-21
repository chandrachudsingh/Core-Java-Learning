import java.applet.Applet;
import java.awt.Graphics;

public class Polygon extends Applet 
{
	public void paint(Graphics g)
	{
		int[] x={150,200,250,300,250,200};
		int[] y={100,50,50,100,150,150};
		
		java.awt.Polygon P=new java.awt.Polygon(x, y, 6);    /*As the Polygon class 
		                                                    inbuilt so we use the st.*/
		
		g.drawPolygon(P);
		//g.drawPolygon(x, y, 6);
	}
}
//<applet code="Polygon.class" width="500" height="500"></applet>
	