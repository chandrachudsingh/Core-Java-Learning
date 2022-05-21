import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class OpenFileDialog_JFileChooser extends JFrame
{
	public static void main(String[] args)
	{
		JFileChooser jfc=new JFileChooser();
//		jfc.setCurrentDirectory(new File(System.getProperty("user.home")));    //sets the current directory to user's 																				 home directory
		jfc.setCurrentDirectory(new File("E:\\Study Material"));           //sets the default to this directory
		
		jfc.setMultiSelectionEnabled(true);            //for multiple selections of the files
		
		int select=jfc.showOpenDialog(null);
		if(select==jfc.APPROVE_OPTION)
		{
			File F=jfc.getSelectedFile();
			System.out.println("Selected File : "+F.getAbsolutePath());
		}
	}
}
