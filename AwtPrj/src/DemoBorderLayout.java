import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Label;

public class DemoBorderLayout extends Applet
{
	Label lbn,lbc,lbs,lbw,lbe;
	
	public void init()
	{
		lbn=new Label("North Selection");
		lbs=new Label("South Selection");
		lbw=new Label("West Selection");
		lbe=new Label("East Selection");
		lbc=new Label("Centre Selection");
		
		setLayout(new BorderLayout());
		add(lbn,BorderLayout.NORTH);
		add(lbs,BorderLayout.SOUTH);
		add(lbw,BorderLayout.WEST);
		add(lbe,BorderLayout.EAST);
		add(lbc,BorderLayout.CENTER);
		
	}
}
//<applet code="DemoBorderLayout.class" width=500 height=500></applet>