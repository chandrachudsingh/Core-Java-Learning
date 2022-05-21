import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class DemoSrollColor extends Applet implements AdjustmentListener
{
	Font F;
	Panel Pred,Pgreen,Pblue,Pcolor;
	Label lbred,lbgreen,lbblue,lbnew,lbcolor;
	Scrollbar sbred,sbgreen,sbblue;
	Color C;
	
	public void init() 
	{	
		F=new Font("ALGERIAN",Font.BOLD,30);
		
		lbred=new Label("Red");
		lbred.setFont(F);
		lbred.setForeground(Color.RED);
		lbgreen=new Label("Green");
		lbgreen.setFont(F);
		lbgreen.setForeground(Color.GREEN);
		lbblue=new Label("Blue");
		lbblue.setFont(F);
		lbblue.setForeground(Color.BLUE);
		lbnew=new Label("New Color");
		lbnew.setFont(F);
		lbnew.setForeground(Color.gray);
		lbcolor=new Label("     ");
		lbcolor.setFont(F);
		
		sbred=new Scrollbar();
		
		sbred.setOrientation(Scrollbar.HORIZONTAL);
		sbred.setBlockIncrement(20);
		sbred.setMinimum(1);
		sbred.setMaximum(265);
		sbred.setPreferredSize(new Dimension(255, 40));
		
		Pred=new Panel();
		Pred.setLayout(new GridLayout(1,2,20,20));
		Pred.add(lbred);
		Pred.add(sbred);
		
		sbgreen=new Scrollbar();
		add(sbgreen);
		
		sbgreen.setOrientation(Scrollbar.HORIZONTAL);
		sbgreen.setBlockIncrement(20);
		sbgreen.setMinimum(1);
		sbgreen.setMaximum(265);
		sbgreen.setPreferredSize(new Dimension(255, 40));
		
		Pgreen=new Panel();
		Pgreen.setLayout(new GridLayout(1,2,20,20));
		Pgreen.add(lbgreen);
		Pgreen.add(sbgreen);
		
		sbblue=new Scrollbar();
		add(sbblue);
		
		sbblue.setOrientation(Scrollbar.HORIZONTAL);
		sbblue.setBlockIncrement(20);
		sbblue.setMinimum(1);
		sbblue.setMaximum(265);
		sbblue.setPreferredSize(new Dimension(255, 40));
		
		Pblue=new Panel();
		Pblue.setLayout(new GridLayout(1,2,20,20));
		Pblue.add(lbblue);
		Pblue.add(sbblue);
		
		Pcolor=new Panel();
		Pcolor.setLayout(new GridLayout(1,2,20,20));
		Pcolor.add(lbnew);
		Pcolor.add(lbcolor);
		
		setLayout(new GridLayout(4,1,20,30));
		add(Pred);
		add(Pgreen);
		add(Pblue);
		add(Pcolor);
		
		sbred.addAdjustmentListener(this);
		sbgreen.addAdjustmentListener(this);
		sbblue.addAdjustmentListener(this);
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) 
	{
		C=new Color(sbred.getValue(), 0, 0);
		sbred.setBackground(C);
		
		C=new Color(0, sbgreen.getValue(), 0);
		sbgreen.setBackground(C);
		
		C=new Color(0, 0, sbblue.getValue());
		sbblue.setBackground(C);
		
		C=new Color(sbred.getValue(), sbgreen.getValue(), sbblue.getValue());
		lbcolor.setBackground(C);
		
		showStatus("Color Range: Red="+sbred.getValue()+" Green="+sbgreen.getValue()+" Blue="+sbblue.getValue());
	}

}
