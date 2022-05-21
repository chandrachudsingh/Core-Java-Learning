import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDialogExample extends Frame implements WindowListener, ActionListener 
{
	Button btclick;
	
	FrameDialogExample()
	{
		setVisible(true);
		setSize(400, 500);
		setTitle("DialogExample");
		
		btclick=new Button("Click");
		
		setLayout(new FlowLayout());
		add(btclick);
		
		btclick.addActionListener(this);
		this.addWindowListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) 
	{	
		Dialog D=new Dialog(this);
		D.setVisible(true);
		D.setSize(400, 500);
		D.add(new Label("Hello"));
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
//<applet code="FrameDialogExample.class" width=500 height=500></applet>