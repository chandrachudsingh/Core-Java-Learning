import java.applet.Applet;
import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DemoComboBox extends Applet implements ItemListener
{
	Choice cbdeg;
	Label lb;
	
	public void init()
	{
		cbdeg=new Choice();
		cbdeg.add("Select Degree");
		cbdeg.add("BTech");
		cbdeg.add("MTech");
		
		lb=new Label();
		
		add(new Label("Degree"));
		add(cbdeg);
		add(lb);
		
		cbdeg.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		lb.setText("Degree selected is:"+cbdeg.getSelectedItem());
		validate();
	}
}
//<applet code="DemoComboBox.class" width=500 height=500></applet>