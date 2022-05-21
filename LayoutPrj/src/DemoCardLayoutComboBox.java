import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Choice;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DemoCardLayoutComboBox extends Applet implements ItemListener
{
	Choice cb;
	Panel Pn,Pc;
	CardLayout CLO;
	
	public void init()
	{
		cb=new Choice();
		cb.add("Select Panel");
		cb.add("Admission Panel");
		cb.add("AOP Panel");
		cb.add("Circle Panel");
		cb.add("MaxMin Panel");
		cb.add("Number Panel");
		cb.add("Swap Panel");
		cb.add("Rectangle Panel");
		cb.add("PetrolPumpBill Panel");
		
		Pn=new Panel();
		Pn.add(cb);
		
		Pc=new Panel();
		CLO=new CardLayout();
		Pc.setLayout(CLO);
		
		Pc.add("Admission Panel",new AdmissionPanel());
		Pc.add("AOP Panel",new AOPPanel());
		Pc.add("Circle Panel",new CirclePanel());
		Pc.add("MaxMin Panel",new MaxMinPanel());
		Pc.add("Number Panel",new NumberPanel());
		Pc.add("Swap Panel",new SwapPanel());
		Pc.add("Rectangle Panel",new RectanglePanel());
		Pc.add("PetrolPumpBill Panel",new PetrolPumpBillPanel());
		
		setLayout(new BorderLayout());
		add(Pn,BorderLayout.NORTH);
		add(Pc,BorderLayout.CENTER);

		cb.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent ie) 
	{
		if(cb.getSelectedIndex()!=0)
			CLO.show(Pc, cb.getSelectedItem());
	}
}
//<applet code="DemoCardLayoutComboBox.class" width=500 height=500></applet>