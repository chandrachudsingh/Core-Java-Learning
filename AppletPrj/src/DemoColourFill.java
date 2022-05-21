import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class DemoColourFill extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(10, 20, 100, 200);
		
		g.setColor(Color.green);
		g.fillRect(100,200,100,200);	
	}
}

//<applet code="DemoColourFill.class" width="300" height="300"></applet>