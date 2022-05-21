import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class JToggleButtonExample extends JFrame implements ItemListener
{
	JToggleButton jtb=null;
	
	public JToggleButtonExample() 
	{
		setSize(400, 350);
		setVisible(true);
		setTitle("Example");
		
		jtb=new JToggleButton("ON");
		
		setLayout(new FlowLayout());
		add(jtb);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		jtb.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if (jtb.isSelected())  
            jtb.setText("OFF");  
        else  
            jtb.setText("ON");
	}
	
	public static void main(String[] args)
	{
		JToggleButtonExample T=new JToggleButtonExample();
	}
}
