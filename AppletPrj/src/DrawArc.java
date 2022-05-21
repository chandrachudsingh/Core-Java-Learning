import java.applet.Applet;
import java.awt.Graphics;

public class DrawArc extends Applet
{
	public void paint(Graphics g)
	{
		g.drawArc(70,70,200,200,70,90);
	}
}
//<applet code="DrawArc.class" width="300" height="300"></applet>