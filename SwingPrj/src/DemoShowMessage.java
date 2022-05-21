import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JOptionPane; 

public class DemoShowMessage extends JApplet
{
	public void init()
	{
		JOptionPane.showMessageDialog(null, "Hello");
		//JOptionPane.showMessageDialog(null, "Hello", "Message Box",JOptionPane.ERROR_MESSAGE );
//		JOptionPane.showMessageDialog(null, "Hello", "Message Box", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("382540.jpg"));
	}
}
