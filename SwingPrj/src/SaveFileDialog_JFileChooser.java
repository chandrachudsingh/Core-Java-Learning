import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class SaveFileDialog_JFileChooser extends JFrame
{
	public SaveFileDialog_JFileChooser()
	{
		JFrame parent=new JFrame();
		JFileChooser jfc=new JFileChooser();
		jfc.setDialogTitle("Specify a file to save");      //sets the title of the dialog box
		
		int select=jfc.showSaveDialog(parent);
		if(select==jfc.APPROVE_OPTION)
		{
			File F=jfc.getSelectedFile();
			System.out.println("Save as file : "+F.getAbsolutePath());
		}
	}
	
	public static void main(String[] args)
	{
		SaveFileDialog_JFileChooser S=new SaveFileDialog_JFileChooser();	
	}
}
