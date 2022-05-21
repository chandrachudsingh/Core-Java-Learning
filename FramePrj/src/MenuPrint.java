import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MenuPrint extends Frame implements ActionListener,WindowListener
{
	MenuBar MB;
	Menu MShape,MColour;
	MenuItem MICircle,MIRectangle,MITriangle,MIRed,MIGreen,MIBlue,MIYellow;
	
	public MenuPrint() 
	{
		setVisible(true);
		setSize(400,500);
		
		MICircle=new MenuItem("Circle");
		MIRectangle=new MenuItem("Rectangle");
		MITriangle=new MenuItem("Triangle");
		MIRed=new MenuItem("Red");
		MIGreen=new MenuItem("Green");
		MIBlue=new MenuItem("Blue");
		MIYellow=new MenuItem("Yellow");
		
		MShape=new Menu("Shape");
		MShape.add(MICircle);
		MShape.addSeparator();
		MShape.add(MIRectangle);
		MShape.addSeparator();
		MShape.add(MITriangle);
		
		MColour=new Menu("Colour");
		MColour.add(MIRed);
		MColour.addSeparator();
		MColour.add(MIGreen);
		MColour.addSeparator();
		MColour.add(MIBlue);
		MColour.addSeparator();
		MColour.add(MIYellow);
		
		MB=new MenuBar();
		MB.add(MShape);
		MB.add(MColour);
		
		setMenuBar(MB);
		
		this.addWindowListener(this);
		
		MICircle.addActionListener(this);
		MIRectangle.addActionListener(this);
		MITriangle.addActionListener(this);
		MIRed.addActionListener(this);
		MIGreen.addActionListener(this);
		MIBlue.addActionListener(this);
		MIYellow.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent ae) 
	{	
		Object src=ae.getSource();
		Graphics g=this.getGraphics();
		
		int w=this.getSize().width, h=this.getSize().height;
		int xc=w/2, yc=h/2,r=w/5;
		g.clearRect(0, 0, w, h);                 //For clearing full frame        
		
		if(src==MIRed)
		{
			g.setColor(Color.RED);
		}
		else if(src==MIBlue)
		{
			g.setColor(Color.BLUE);
		}
		else if(src==MIGreen)
		{
			g.setColor(Color.GREEN);
		}
		else if(src==MIYellow)
		{
			g.setColor(Color.YELLOW);
		}
		
		if(src==MICircle)
		{
			g.fillOval(xc-r, yc-r, 2*r, 2*r);
		}
		
		else if(src==MIRectangle)
		{
			g.fillRect(100, 200, 200, 100);
		}
		
		else if(src==MITriangle)
		{
			int[] x= {50,200,350};
			int[] y= {350,100,350};
			Polygon P=new Polygon(x, y, 3);
			g.fillPolygon(P);
		}
	}

}
