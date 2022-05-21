import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class DemoLine extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.red);
		//setForeground(Color.white);
		g.setColor(Color.white);
		g.drawLine(10, 50, 200, 210);
		
		g.setColor(Color.blue);
		g.drawLine(20, 75, 200, 210);
	}
}

//<applet code="DemoLine.class" width="300" height="300"></applet>