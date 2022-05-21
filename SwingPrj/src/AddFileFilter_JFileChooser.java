import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddFileFilter_JFileChooser extends FileFilter
{
	private String extension,description;
	
	public AddFileFilter_JFileChooser(String extention,String description) 
	{
		this.extension=extension;
		this.description=description;
	}

	@Override
	public boolean accept(File F) 
	{
		if(F.isDirectory())
			return true;
		return F.getName().endsWith(extension);
	}

	@Override
	public String getDescription() 
	{
		return description+String.format("( *%s)", extension);
	}
	
	public static void main(String[] args)
	{
		FileFilter docFilter=new AddFileFilter_JFileChooser(".docx", "Micrsosft word documents");     
		FileFilter pdfFilter=new AddFileFilter_JFileChooser(".pdf", "PDF documents");   		/*for adding single 
																								extension of one type*/
		JFileChooser jfc=new JFileChooser();
		jfc.addChoosableFileFilter(docFilter);
		jfc.addChoosableFileFilter(pdfFilter);
		
		jfc.showDialog(null, "Don't");           //for custom button
	}
}
