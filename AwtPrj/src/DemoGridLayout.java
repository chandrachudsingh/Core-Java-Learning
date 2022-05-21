import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;

public class DemoGridLayout extends Applet
{
	Button[] bt;
	
	public void init()
	{
		bt=new Button[100];
		
		for(int i=0;i<bt.length;i++)
			bt[i]=new Button(i+"");
		
		setLayout(new GridLayout(10,20));
		
		for(int i=0;i<bt.length;i++)
			add(bt[i]);
	}
}
//<applet code="DemoGridLayout.class" width=500 height=500></applet>