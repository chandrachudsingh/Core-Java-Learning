import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class DemoALC extends Applet
{
	public void init()
	{
		showStatus("Initialization Process...");
		for(long i=1;i<=1000000000;i++);
	}
	
	public void start()
	{
		showStatus("Start Process...");
		for(long i=1;i<=1000000000;i++);
	}
	
	public void paint(Graphics g)
	{
		setBackground(Color.red);
		setForeground(Color.white);
		g.drawString("Hello",30,40);
	}
	
	public void stop()
	{
		showStatus("Stop Process...");
		for(long i=1;i<=1000000000;i++);
	}
	
	public void destroy()
	{
		showStatus("Destroy Process...");
		for(long i=1;i<=1000000000;i++);
	}
}
//<applet code="DemoALC.class" width="300" height="300"></applet>