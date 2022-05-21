import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DemoRadioButton extends Applet implements ItemListener
{
	Checkbox rdmale,rdfemale;
	CheckboxGroup gr;
	Label lb;
	
	public void init()
	{
		gr=new CheckboxGroup();
		rdmale=new Checkbox("Male",gr,false);
		rdfemale=new Checkbox("Female",gr,false);
		
		lb=new Label();
		
		add(new Label("Gender"));
		add(rdmale);
		add(rdfemale);
		add(lb);
		
		rdmale.addItemListener(this);
		rdfemale.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(rdmale.getState())
			lb.setText("Hello Mr.");
		else
			lb.setText("Hello Mrs.");
		validate();
	}
}
//<applet code="DemoRadioButton.class" width=500 height=500></applet>