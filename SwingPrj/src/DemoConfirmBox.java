import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DemoConfirmBox extends JApplet
{
	public void init()
	{
		int ans=JOptionPane.showConfirmDialog(null, "Movie dekhne ka he kya tereko:");
		
		if(ans==JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Dekh le bhai");
		else 
			JOptionPane.showMessageDialog(null, "Chal Hat");
	}
}
