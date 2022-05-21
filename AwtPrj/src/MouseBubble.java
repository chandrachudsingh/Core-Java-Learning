import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseBubble extends Applet implements MouseListener
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
		
		Color C=new Color((int)((Math.random()*1000)%255),(int)((Math.random()*1000)%255),(int)((Math.random()*1000)%255));
		
		Graphics g=this.getGraphics();
		g.setColor(C);
		g.fillOval(x, y, 10, 10);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
//<applet code="MouseBubble.class" width=500 height=500></applet>