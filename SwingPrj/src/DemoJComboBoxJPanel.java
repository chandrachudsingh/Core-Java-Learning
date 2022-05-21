import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DemoJComboBoxJPanel extends JApplet implements ItemListener
{
	JLabel lbst;
	JComboBox cbmovie;
	
	public void init()
	{
		lbst=new JLabel("Your fovourite movie is:");
		
		cbmovie=new JComboBox();
		cbmovie.addItem("Select your favourite movie series");
		cbmovie.addItem("Avengers");
		cbmovie.addItem("Justice League");
		cbmovie.addItem("Fast & Furious");
		cbmovie.addItem("Tranformer");
		
		setLayout(new FlowLayout());
		add(lbst);
		add(cbmovie);
		
		cbmovie.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		lbst.setText("Your favourite movie is:"+cbmovie.getSelectedItem().toString());
	}
}
