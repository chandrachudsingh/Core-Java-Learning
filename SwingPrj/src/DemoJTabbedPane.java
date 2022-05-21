import javax.swing.JApplet;
import javax.swing.JTabbedPane;

public class DemoJTabbedPane extends JApplet
{
	JTabbedPane Jtp;
	
	public void init()
	{
		Jtp=new JTabbedPane();
		
		Jtp.addTab("JComboBox", new DemoJComboBoxJPanel());
		Jtp.addTab("JButton", new DemoJButtonJPanel());
		
		add(Jtp);
	}
}
