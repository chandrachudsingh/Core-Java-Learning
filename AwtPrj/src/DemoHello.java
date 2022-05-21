import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DemoHello extends Applet implements MouseListener
{

	public void init()
	{
		this.addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent me) 
	{
		int x=me.getX();
		int y=me.getY();
	
		Graphics g=this.getGraphics();
		g.drawString("Hello", x, y);
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
			
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
//<applet code="DemoHello.class" width=500 height=500></applet>