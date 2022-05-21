import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingJFrame extends JFrame implements ItemListener
{
	JCheckBox chmusic,chdance,chplay;
	JLabel lbst;
	
	public SwingJFrame()
	{
		setVisible(true);
		setSize(400,500);
		
		chmusic=new JCheckBox("Music");
		chdance=new JCheckBox("Dance");
		chplay=new JCheckBox("Play");
		
		lbst=new JLabel();
		
		setLayout(new FlowLayout());
		add(new JLabel("Select your Hobbies:"));
		add(chmusic);
		add(chdance);
		add(chplay);
		add(lbst);
		
		chmusic.addItemListener(this);
		chdance.addItemListener(this);
		chplay.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		String str="Your Hobbies are: ";
		if(chmusic.isSelected())
			str+="Music ";
		if(chdance.isSelected())
			str+="Dance ";
		if(chplay.isSelected())
			str+="Play ";
		
		lbst.setText(str);
	}

}
