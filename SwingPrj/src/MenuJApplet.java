import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JApplet;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

public class MenuJApplet extends JApplet 
{
	JMenuBar MB;
	JMenu MINew,MFile,MEdit,MHelp;
	JMenuItem MIOpen,MISave,MISaveAs,MIClose,MICut,MICopy,MIPaste,MIsuggestion,MIcontact,MIProj,MIClass,MIfile;
	JCheckBoxMenuItem MIBold,MIItalic;
	JRadioButtonMenuItem MIMale,MIFemale;
	
	public void init()
	{
		setVisible(true);
		setSize(400,500);
		 
		MIProj=new JMenuItem("Project");
		MIClass=new JMenuItem("Class");
		MIfile=new JMenuItem("File");
		
		MINew=new JMenu("New");
		MINew.add(MIProj);
		MINew.add(MIClass);
		MINew.add(MIfile);
		
		MIOpen=new JMenuItem("Open");   
		MISave=new JMenuItem("Save");
		MISaveAs=new JMenuItem("SaveAs");
		MIClose=new JMenuItem("Close");
		MICut=new JMenuItem("Cut");
		MICopy=new JMenuItem("Copy");
		MIPaste=new JMenuItem("Paste");
		MIsuggestion=new JMenuItem("Suggestion");
		MIcontact=new JMenuItem("Contact");
		
		MIBold=new JCheckBoxMenuItem("BOLD");
		MIItalic=new JCheckBoxMenuItem("ITALIC");
		
		MIMale=new JRadioButtonMenuItem("Male");
		MIFemale=new JRadioButtonMenuItem("Female");
		
		MFile=new JMenu("File");
		MFile.add(MINew);
		MFile.addSeparator();
		MFile.add(MIOpen);
		MFile.addSeparator();
		MFile.add(MISave);
		MFile.addSeparator();
		MFile.add(MISaveAs);
		MFile.addSeparator();
		MFile.add(MIClose);
		
		MEdit=new JMenu("Edit");
		MEdit.add(MICut);
		MEdit.addSeparator();
		MEdit.add(MICopy);
		MEdit.addSeparator();
		MEdit.add(MIPaste);
		MEdit.addSeparator();
		MEdit.add(MIBold);
		MEdit.addSeparator();
		MEdit.add(MIItalic);
		MEdit.addSeparator();
		MEdit.add(MIMale);
		MEdit.addSeparator();
		MEdit.add(MIFemale);
		
		MHelp=new JMenu("Help");
		MHelp.add(MIsuggestion);
		MHelp.addSeparator();
		MHelp.add(MIcontact);
		
		MB=new JMenuBar();
		MB.add(MFile);
		MB.add(MEdit);
		MB.add(MHelp);
		
		setJMenuBar(MB);
	}
}