import java.awt.Frame;
import java.awt.Graphics;
import java.awt.MenuItem;
import java.awt.Polygon;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DemoPopupMenu extends Frame implements WindowListener, MouseListener, ActionListener
{
	PopupMenu PM;
	MenuItem MICircle,MIRect,MITriangle;
	
	public DemoPopupMenu() 
	{
		setVisible(true);
		setSize(400, 500);
		
		MICircle=new MenuItem("Circle");
		MIRect=new MenuItem("Rectangle");
		MITriangle=new MenuItem("Traingle");
		
		PM=new PopupMenu();
		PM.add(MICircle);
		PM.add(MIRect);
		PM.add(MITriangle);
		
		add(PM);
		
		this.addMouseListener(this);
		this.addWindowListener(this);
		
		MICircle.addActionListener(this);
		MIRect.addActionListener(this);
		MITriangle.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) 
	{	
		Object src=ae.getSource();
		Graphics g=this.getGraphics();
		
		int w=this.getSize().width, h=this.getSize().height;
		int xc=w/2, yc=h/2,r=w/5;
		g.clearRect(0, 0, w, h);                 //For clearing full frame 
		
		if(src==MICircle)
		{
			g.drawOval(xc-r, yc-r, 2*r, 2*r);
		}
		
		else if(src==MIRect)
		{
			g.drawRect(100, 200, 200, 100);
		}
		
		else if(src==MITriangle)
		{
			int[] x= {50,200,350};
			int[] y= {350,100,350};
			Polygon P=new Polygon(x, y, 3);
			g.drawPolygon(P);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent me) 
	{
		if(me.isPopupTrigger())
		{
			int x=me.getX();
			int y=me.getY();
			
			PM.show(this, x, y);
		}
	}

	@Override
	public void mouseReleased(MouseEvent me) 
	{
		if(me.isPopupTrigger())
		{
			int x=me.getX();
			int y=me.getY();
			
			PM.show(this, x, y);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{	
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
		DemoPopupMenu P=new DemoPopupMenu();
	}
}
