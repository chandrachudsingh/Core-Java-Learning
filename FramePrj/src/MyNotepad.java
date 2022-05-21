import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyNotepad extends Frame implements WindowListener
{
	MenuBar MB;
	Menu MFile,MEdit,MHelp;
	MenuItem MINew,MIOpen,MISave,MISaveAs,MIClose,MICut,MICopy,MIPaste,MIsuggestion,MIcontact;
	
	public MyNotepad()
	{
		setVisible(true);
		setSize(400,500);
		
		MINew=new MenuItem("New");
		MenuShortcut MS=new MenuShortcut(KeyEvent.VK_N);        
		MINew.setShortcut(MS);                              //For adding shortcut key
		
		MIOpen=new MenuItem("Open",new MenuShortcut(KeyEvent.VK_O,true));   //For adding shortcut key(Method 2)   true for shift
		MISave=new MenuItem("Save");
		MISaveAs=new MenuItem("SaveAs");
		MIClose=new MenuItem("Close");
		MICut=new MenuItem("Cut");
		MICopy=new MenuItem("Copy");
		MIPaste=new MenuItem("Paste");
		MIsuggestion=new MenuItem("Suggestion");
		MIcontact=new MenuItem("Contact");
		
		MFile=new Menu("File");
		MFile.add(MINew);
		MFile.addSeparator();       //for separating menuitems by a line
		MFile.add(MIOpen);
		MFile.addSeparator();
		MFile.add(MISave);
		MFile.addSeparator();
		MFile.add(MISaveAs);
		MFile.addSeparator();
		MFile.add(MIClose);
		
		MEdit=new Menu("Edit");
		MEdit.add(MICut);
		MEdit.addSeparator();
		MEdit.add(MICopy);
		MEdit.addSeparator();
		MEdit.add(MIPaste);
		
		MHelp=new Menu("Help");
		MHelp.add(MIsuggestion);
		MHelp.addSeparator();
		MHelp.add(MIcontact);
		
		MB=new MenuBar();
		MB.add(MFile);
		MB.add(MEdit);
		MB.add(MHelp);
		
		setMenuBar(MB);
		
		this.addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);	
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}