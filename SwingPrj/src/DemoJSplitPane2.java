import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class DemoJSplitPane2 extends JApplet
{
	JScrollPane ULJsp,URJsp,LJsp;
	JSplitPane Jsp,UJsp;
	
	public void init()
	{
		ULJsp=new JScrollPane(new JLabel(new ImageIcon("382540.jpg")));
		URJsp=new JScrollPane(new JLabel(new ImageIcon("564005.jpg")));
		LJsp=new JScrollPane(new JLabel(new ImageIcon("1155345.jpg")));

		UJsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,ULJsp,URJsp);
		UJsp.setResizeWeight(0.5);
		Jsp=new JSplitPane(JSplitPane.VERTICAL_SPLIT,UJsp,LJsp);
		Jsp.setResizeWeight(0.5);
		
		add(Jsp);
	}
}
