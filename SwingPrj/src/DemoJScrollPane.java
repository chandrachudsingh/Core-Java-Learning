import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class DemoJScrollPane extends JApplet
{
	JScrollPane Jsp;
	JLabel lb;
	public void init()
	{
		//lb=new JLabel(new ImageIcon("564005.jpg"));
		Jsp=new JScrollPane();
		
		Jsp.setViewportView(new DemoJButtonJPanel());       //(new JLabel(new ImageIcon("564005.jpg")));
		add(Jsp);
	}
}
