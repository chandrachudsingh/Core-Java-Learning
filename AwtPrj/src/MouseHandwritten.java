import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseHandwritten extends Applet implements MouseMotionListener
{
	public void init()
	{
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent me) 
	{
		int x=me.getX();
		int y=me.getY();

		Font F=new Font("comic sans",Font.BOLD,50);
		
		Graphics g=this.getGraphics();
		g.setColor(Color.cyan);
		g.setFont(F);
		g.drawString(".", x, y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
//<applet code="MouseHandwritten.class" width=500 height=500></applet>