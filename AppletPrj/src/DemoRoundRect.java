import java.applet.Applet;
import java.awt.Graphics;

public class DemoRoundRect extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRoundRect(10, 20, 200, 300 ,10, 15);
	}
}

//<applet code="DemoRoundRect.class" width="300" height="300"></applet>