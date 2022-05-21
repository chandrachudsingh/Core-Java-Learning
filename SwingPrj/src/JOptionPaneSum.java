import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class JOptionPaneSum extends JApplet
{
	public void init()
	{
		String num1=JOptionPane.showInputDialog("Enter first no:");
		String num2=JOptionPane.showInputDialog("Enter second no:");
		
		JOptionPane.showMessageDialog(null, "Sum of the two numbers = "+(Integer.parseInt(num1)+
				Integer.parseInt(num2)));
	}
}
