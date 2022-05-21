import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class DemoString extends Applet
{
	public void paint(Graphics g)
	{	
		setBackground(Color.red);
		setForeground(Color.white);
		g.drawString("Hello",30,40);
	}
}

//<applet code="DemoString.class" width="300" height="300"></applet>