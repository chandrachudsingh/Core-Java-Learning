import java.applet.Applet;
import java.awt.Graphics;

public class DemoOval extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(10, 20, 100, 200);
	}
}

//<applet code="DemoOval.class" width="300" height="300"></applet>