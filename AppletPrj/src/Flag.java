import java.applet.Applet;
import java.awt.Graphics;

public class Flag extends Applet
{
	public void paint(Graphics g)
	{
		int x=100, y=100;
		
		g.drawRect(x,y,10,200);
		for(int i=0; i<=2; i++)
			g.drawRect(x+10,(y+(i*15)),120,15);
		
		for(int i=1; i<=3; i++)
			g.drawRect((x-(i*15)),(y+200+((i-1)*10)),(2*(i*15))+10,10);
	}
}
//<applet code="Flag.class" width="500" height="500"></applet>