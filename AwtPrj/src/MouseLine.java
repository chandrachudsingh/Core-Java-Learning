import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseLine extends Applet implements MouseListener
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
		int w=this.getSize().width,h=this.getSize().height;
		
		Color C=new Color((int)((Math.random()*1000)%255),(int)((Math.random()*1000)%255),(int)((Math.random()*1000)%255));

		Graphics g=this.getGraphics();
		g.setColor(C);
		g.drawLine(w/2, h/2, x, y);
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
//<applet code="MouseLine.class" width=500 height=500></applet>