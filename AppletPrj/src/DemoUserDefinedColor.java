import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class DemoUserDefinedColor extends Applet
{
	public void paint(Graphics g)
	{	
		Color C1=new Color(100,40,150);
		g.setColor(C1);
		g.fillOval(10, 20, 100, 200);
		
		Color C2=new Color(0.4f,0.1f,0.8f);
		g.setColor(C2);
		g.fillRect(200, 20, 100, 200);	
	}
}

//<applet code="DemoUserDefinedColor.class" width="300" height="300"></applet>