import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DemoInputDialog extends JApplet
{
	public void init()
	{
		//String name=JOptionPane.showInputDialog("Enter your name:");
		//String name=JOptionPane.showInputDialog(null, "Enter your name:");
		String name=JOptionPane.showInputDialog("Enter your name:", "Singh");
		//String name=JOptionPane.showInputDialog(null, "Enter your name:", "Singh");
//		String name=JOptionPane.showInputDialog(null, "Enter your name:", "Message Box", JOptionPane.CANCEL_OPTION);
		
		Object[] Options= {"Terminator","Transformers","Avengers","Justice League"};
		Object fav_movie=JOptionPane.showInputDialog(null, "Enter favourite movie:", "Movie", 
				JOptionPane.OK_CANCEL_OPTION, new ImageIcon("thor.jpg"), Options, Options[2]);
		
		JOptionPane.showMessageDialog(null, "Favourite Movie, "+fav_movie);
	}
}
