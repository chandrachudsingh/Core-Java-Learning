import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class DemoJSplitPane3 extends JApplet
{
	JScrollPane ULJsp,URJsp,LLJsp,LRJsp;
	JSplitPane Jsp,UJsp,LJsp;
	
	public void init()
	{
		ULJsp=new JScrollPane(new JLabel(new ImageIcon("382540.jpg")));
		URJsp=new JScrollPane(new JLabel(new ImageIcon("564005.jpg")));
		LLJsp=new JScrollPane(new JLabel(new ImageIcon("1155345.jpg")));
		LRJsp=new JScrollPane(new JLabel(new ImageIcon("889103.jpg")));

		UJsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,ULJsp,URJsp);
		LJsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,LLJsp,LRJsp);
		Jsp=new JSplitPane(JSplitPane.VERTICAL_SPLIT,UJsp,LJsp);
		
		add(Jsp);
	}
}
