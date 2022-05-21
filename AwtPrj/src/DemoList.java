import java.applet.Applet;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.GridLayout;
import java.awt.Label;

public class DemoList extends Applet implements ItemListener
{
	List lsdep;
	Label lb,st;
	
	public void init()
	{	
		lsdep=new List();
		lsdep.add("Select Degree");
		lsdep.add("BTech");
		lsdep.add("MTech");
		
		lb=new Label();
		
		add(new Label("Degree"));
		add(lsdep);
		add(lb);
		
		lsdep.addItemListener(this);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		lb.setText("Degree selected is: "+lsdep.getSelectedItem());	
	}
}
//<applet code="DemoList.class" width=500 height=500></applet>