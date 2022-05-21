import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class FlagFill extends Applet
{
	public void paint(Graphics g)
	{
		int x=100, y=100;
		
		g.setColor(Color.gray);
		g.fillRect(x,y,10,200);
		
		Color C1=new Color(250,0,10);
		g.setColor(C1);
		g.fillRect(x+10,(y+15),120,15);

		g.setColor(Color.white);
		g.fillRect(x+10,(y+30),120,15);
		
		Color C2=new Color(10,200,10);
		g.setColor(C2);
		g.fillRect(x+10,(y+45),120,15);
		
		Color C3=null;
		for(int i=1; i<=3; i++)
		{	
			C3=new Color(50+(i*20),50,65-(i*20));
			g.setColor(C3);
			g.fillRect((x-(i*15)),(y+200+((i-1)*10)),(2*(i*15))+10,10);
		}
	}
}
//<applet code="FlagFill.class" width="500" height="500"></applet>