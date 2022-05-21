import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameExample extends Frame implements WindowListener            //Frame is a parent container like Applet
{
	Label lb1,lb2;
	
	FrameExample()
	{
		lb1=new Label("Hello");
		lb2=new Label("Bye");
		setVisible(true);
		setSize(400, 500);
		setTitle("Frame Example");
		
		setLayout(new FlowLayout());
		add(lb1);
		add(lb2);
		
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
//<applet code="FrameExample.class" width=500 height=500></applet>