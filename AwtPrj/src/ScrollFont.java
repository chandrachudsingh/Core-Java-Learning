import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollFont extends Applet implements AdjustmentListener
{
	Panel P1,P2;
	Scrollbar sb;
	Label lbsize,lb;
	Font F;
	
	public void init() 
	{	
		F=new Font("ALGERIAN", Font.BOLD, 20);
		lb=new Label("Welcome");
		lb.setFont(F);
		lbsize=new Label("Size");
		
		sb=new Scrollbar();
		
		sb.setOrientation(Scrollbar.HORIZONTAL);
		sb.setBlockIncrement(20);
		sb.setMinimum(10);
		sb.setMaximum(50);
		sb.setValue(20);
		sb.setPreferredSize(new Dimension(100,20));
		
		P1=new Panel();
		P1.setLayout(new GridLayout(1,2));
		P1.add(lbsize);
		P1.add(sb);
		
		P2=new Panel();
		P2.add(lb);
		
		setLayout(new BorderLayout());
		add(P1, BorderLayout.NORTH);
		add(P2, BorderLayout.CENTER);
		
		sb.addAdjustmentListener(this);
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent ae) 
	{
		F=new Font("ALGERIAN", Font.BOLD, sb.getValue());
		lb.setFont(F);
		lb.setText("Welcome");
	}
	
}
