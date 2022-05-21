import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class DemoDateComboBox extends JApplet implements ItemListener
{
	JComboBox cbday,cbmonth,cbyear;
	JLabel lbst;
	
	public void init()
	{
		cbday=new JComboBox();
		cbmonth=new JComboBox();
		cbyear=new JComboBox();
		
		lbst=new JLabel("Date");
		
		cbyear.addItem("Select Year");
		for(int i=0;i<=100;i++)
			cbyear.addItem(1960+i);
		cbyear.setSelectedIndex(60);
		
		cbmonth.addItem("Select Month");
		for(int i=1;i<=12;i++)
			cbmonth.addItem(i);
		
		cbday.addItem("Select Day");
		
		setLayout(new FlowLayout());
		add(lbst);
		add(cbyear);
		add(cbmonth);
		add(cbday);
		
		cbyear.addItemListener(this);
		cbmonth.addItemListener(this);
		cbday.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if((cbyear.getSelectedIndex()-1)%4==0 && cbyear.getSelectedIndex()!=0)
		{
			if(cbmonth.getSelectedIndex()>=1 && cbmonth.getSelectedIndex()<=7)
			{
				if(cbmonth.getSelectedIndex()%2!=0)
				{
					for(int i=1;i<=31;i++)
						cbmonth.addItem(i);
				}
			}
			else if(cbmonth.getSelectedIndex()>=8 && cbmonth.getSelectedIndex()<=12)
			{
				if(cbmonth.getSelectedIndex()%2==0)
				{
					for(int i=1;i<=29;i++)
						cbmonth.addItem(i);
					
					if(cbmonth.getSelectedIndex()!=2)
						cbmonth.addItem(30);
				}
			}
		}
	}
}
