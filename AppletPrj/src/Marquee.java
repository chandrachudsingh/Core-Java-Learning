import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Marquee extends Applet implements Runnable
{
	Thread Th;

	int x=0,y=100;
	public void init()
	{
		setBackground(Color.red);
		setForeground(Color.white);
	}
	
	public void start()
	{
		Th=new Thread(this,"first");
		Th.start();
	}
	
	public void run()
	{
		do
		{
			repaint();
			try
			{
				Thread.sleep(20);
			}
			catch(InterruptedException E)
			{
				E.printStackTrace();
			}
			
			x+=2;
			if(x>(this.getSize().width))
				x=0;
			
		}while(true);
		
	}
	public void paint(Graphics g)
	{	
		Font F=new Font("ALGERIAN",Font.BOLD+Font.ITALIC,30);
		g.setFont(F);
	
		g.drawString("Hello",x,y);
	}
}
//<applet code="Marquee.class" width="500" height="500"></applet>