import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;

public class DemoFlowLayout extends Applet
{
	Button[] bt;
	
	public void init()
	{
		bt=new Button[100];
		
		for(int i=0;i<bt.length;i++)
			bt[i]=new Button(i+"");
		
		setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		
		for(int i=0;i<bt.length;i++)
			add(bt[i]);
	}
}
//<applet code="DemoFlowLayout.class" width=500 height=500></applet>