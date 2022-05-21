import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class DemoJSplitPane extends JApplet
{
	JScrollPane Rjsp,Ljsp;
	JSplitPane Jsp;
	
	public void init()
	{
		Rjsp=new JScrollPane(new JLabel(new ImageIcon("889098.jpg")));
		Ljsp=new JScrollPane(new JLabel(new ImageIcon("382540.jpg")));
		
		Jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,Rjsp,Ljsp);
		Jsp.setResizeWeight(0.5);
		add(Jsp);
	}
}
