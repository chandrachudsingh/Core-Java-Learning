import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class DemoJRadioButton extends JApplet implements ItemListener
{
	JRadioButton rbbca,rbmca,rbmtech,rbbtech;
	ButtonGroup bg;
	JLabel lbmsg;
	
	public void init()
	{
		rbbca=new JRadioButton("BCA");
		rbmca=new JRadioButton("MCA");
		rbbtech=new JRadioButton("BTech");
		rbmtech=new JRadioButton("MTech");
		
		bg=new ButtonGroup();
		bg.add(rbbca);
		bg.add(rbmca);
		bg.add(rbbtech);
		bg.add(rbmtech);
		
		lbmsg=new JLabel();
		
		setLayout(new FlowLayout());
		add(new JLabel("Select Degree"));
		add(rbbca);
		add(rbmca);
		add(rbbtech);
		add(rbmtech);
		add(lbmsg);
		
		rbbca.addItemListener(this);
		rbmca.addItemListener(this);
		rbbtech.addItemListener(this);
		rbmtech.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(rbbca.isSelected())
			lbmsg.setText("Your Degree is "+rbbca.getText());
		else if(rbmca.isSelected())
			lbmsg.setText("Your Degree is "+rbmca.getText());
		else if(rbbtech.isSelected())
			lbmsg.setText("Your Degree is "+rbbtech.getText());
		else 
			lbmsg.setText("Your Degree is "+rbmtech.getText());
	}

}
