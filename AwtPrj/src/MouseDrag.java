import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseDrag extends Applet implements MouseListener
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
		g.setColor(Color.BLUE);
		g.drawString("CLicked", x, y);
	}

	@Override
	public void mousePressed(MouseEvent me) 
	{
		int x=me.getX();
		int y=me.getY();

		Graphics g=this.getGraphics();
		g.setColor(Color.cyan);
		g.drawString("Pressed", x, y);
	}

	@Override
	public void mouseReleased(MouseEvent me) 
	{
		int x=me.getX();
		int y=me.getY();

		Graphics g=this.getGraphics();
		g.setColor(Color.green);
		g.drawString("Released", x, y);
	}

	@Override
	public void mouseEntered(MouseEvent me) 
	{	
		int x=me.getX();
		int y=me.getY();

		Graphics g=this.getGraphics();
		g.setColor(Color.DARK_GRAY);
		g.drawString("Entered", x, y);
	}

	@Override
	public void mouseExited(MouseEvent me) 
	{
		int x=me.getX();
		int y=me.getY();

		Graphics g=this.getGraphics();
		g.setColor(Color.DARK_GRAY);
		g.drawString("Exited", x, y);
	}
}
//<applet code="MouseDrag.class" width=500 height=500></applet>