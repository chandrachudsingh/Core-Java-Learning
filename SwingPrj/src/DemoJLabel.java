import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;

public class DemoJLabel extends JApplet 
{
	JLabel lb1,lb2;
	Container Pane;
	
	public void init()
	{
		ImageIcon img=new ImageIcon("Spider.jpg");
		
		lb1=new JLabel("Hello");
		lb1.setIcon(img);
		
		img=new ImageIcon("Wonderwoman.jpg");
		lb2=new JLabel("Bye");
		lb2.setIcon(img);
		lb2.setLayout(new FlowLayout());
		lb2.add(new JLabel("hhhh"));
	
		add(lb1,BorderLayout.NORTH);
		add(lb2);
	}
}
