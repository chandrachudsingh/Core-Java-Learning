import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class FilledCocentricCircleScr extends Applet
{
		
	public void paint(Graphics g)
	{	
	    //Circle should be drawn from bigger to small
		
		int w=this.getSize().width,h=this.getSize().height;    /*refreshes the screen,
		                                                         so paint executes*/
		int xc=w/2,yc=h/2,r=w/8;
		
		Color C=null;
		
		for(int i=0;i<=4;i++)
		{
			// C=new Color((10+(i*40)),(51-(10*i)),(20+(i*10)));
			C=new Color((int)(Math.random()*1000)%255,(int)(Math.random()*1000)%255,(int)(Math.random()*1000)%255);
			g.setColor(C);

			g.fillOval(xc-r ,yc-r , 2*r , 2*r);
			r-=w/60;
		}
	}
}

//<applet code="FilledCocentricCircleScr.class" width="300" height="300"></applet>
