import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class DemoSrollCircleSize extends Applet implements AdjustmentListener
{
	Scrollbar sbheight,sbwidth;
	
	public void paint(Graphics g)
	{
		int w=this.getSize().width, h=this.getSize().height;
		int xc=w/2,yc=h/2,r=w/10;
		
		g.drawOval(xc-r, yc-r, 2*r+sbwidth.getValue(), 2*r+sbheight.getValue());
	}
	
	public void init()
	{
		sbheight=new Scrollbar();
		
		sbheight.setOrientation(Scrollbar.VERTICAL);
		sbheight.setBlockIncrement(20);
		sbheight.setMinimum(1);
		sbheight.setMaximum(160);
		sbheight.setPreferredSize(new Dimension(20,80));
		
        sbwidth=new Scrollbar();
		
		sbwidth.setOrientation(Scrollbar.HORIZONTAL);
		sbwidth.setBlockIncrement(20);
		sbwidth.setMinimum(1);
		sbwidth.setMaximum(160);
		sbwidth.setPreferredSize(new Dimension(80,20));
		
		setLayout(new BorderLayout());
		add(sbheight, BorderLayout.WEST);
		add(sbwidth, BorderLayout.SOUTH);
		
		sbheight.addAdjustmentListener(this);
		sbwidth.addAdjustmentListener(this);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent ae) 
	{
		repaint();		
	}
}
