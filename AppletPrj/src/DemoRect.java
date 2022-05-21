import java.applet.Applet;
import java.awt.Graphics;

public class DemoRect extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(10, 20, 100, 200);
	}
}

//<applet code="DemoRect.class" width="300" height="300"></applet>