import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DemoJButtonJPanel extends JPanel implements ActionListener
{
	JButton bt1,bt2,bt3,bt4,bt5;
	
	public DemoJButtonJPanel()
	{
		bt1=new JButton(new ImageIcon("ragnarok.jpg"));
		bt1.setPressedIcon(new ImageIcon("thor.jpg"));
		bt1.setToolTipText("bt1");
		
		bt2=new JButton(new ImageIcon("Spider.jpg"));
		bt2.setRolloverIcon(new ImageIcon("Aqua.jpg"));
		
		bt3=new JButton(new ImageIcon("thor.jpg"));
		bt3.setDisabledIcon(new ImageIcon("ragnarok.jpg"));
		
		bt4=new JButton(new ImageIcon("Wonderwoman.jpg"));
		bt4.setSelectedIcon(new ImageIcon("Spider.jpg"));
		
		bt5=new JButton(new ImageIcon("Aqua.jpg"));
		bt5.setSelectedIcon(new ImageIcon("Wonderwoman.jpg"));
		
		add(bt1,BorderLayout.NORTH);
		add(bt2,BorderLayout.WEST);
		add(bt3,BorderLayout.CENTER);
		add(bt4,BorderLayout.EAST);
		add(bt5,BorderLayout.SOUTH);
		
		bt2.addActionListener(this);
		bt3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Object src=ae.getSource();
		
		if(src==bt2)
		{
			bt5.setSelected(true);
		}
		
		else if(src==bt3)
		{
			bt4.setEnabled(false);
		}
	}
}
