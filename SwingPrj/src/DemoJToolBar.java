import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

public class DemoJToolBar extends JApplet
{
	JToolBar Jtb;
	JButton bt1,bt2;
	JCheckBox ch1,ch2;
	JRadioButton rb1,rb2;
	ButtonGroup bg;
	JComboBox cb1,cb2;
	
	public void init()
	{
		bt1=new JButton("bt1");
		bt2=new JButton("bt2");
		
		ch1=new JCheckBox("ch1");
		ch2=new JCheckBox("ch2");
		
		rb1=new JRadioButton("rb1");
		rb2=new JRadioButton("rb2");
		bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		cb1=new JComboBox();
		cb1.addItem("Petrol");
		cb1.addItem("Diesel");
		cb1.addItem("Gas");
		
		cb2=new JComboBox();
		cb2.addItem("Petrol");
		cb2.addItem("Diesel");
		cb2.addItem("Gas");
		
		Jtb=new JToolBar();
		Jtb.setLayout(new FlowLayout());
		Jtb.add(bt1);
		Jtb.add(bt2);
		Jtb.add(ch1);
		Jtb.add(ch2);
		Jtb.add(rb1);
		Jtb.add(rb2);
		Jtb.add(cb1);
		Jtb.add(cb2);
		
		add(Jtb);
		
		Jtb.setFloatable(false);
	}
}
