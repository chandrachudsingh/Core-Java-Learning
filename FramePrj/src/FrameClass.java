import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameClass extends Frame implements WindowListener, ActionListener
{
	Button btmaxmin,btaop,btcircle,btnum;
	
	public FrameClass()
	{
		setVisible(true);
		setSize(400, 500);
		setTitle("Frame class");
		
		btmaxmin=new Button("MaxMin Dialog");
		btaop=new Button("AOP Dialog");
		btcircle=new Button("Circle Dialog");
		btnum=new Button("Number Dialog");
		
		setLayout(new FlowLayout());
		add(btmaxmin);
		add(btaop);
		add(btcircle);
		add(btnum);
		
		this.addWindowListener(this);
		btmaxmin.addActionListener(this);
		btaop.addActionListener(this);
		btcircle.addActionListener(this);
		btnum.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Object src=ae.getSource();
		
		if(src==btmaxmin)
		{
			Dialog D=new MaxMinDialog(this);
			D.setVisible(true);
			D.setSize(300,400);
		}
		
		else if(src==btaop)
		{
			Dialog D=new AOPDialog(this);
			D.setVisible(true);
			D.setSize(300,400);
		}
		
		else if(src==btcircle)
		{
			Dialog D=new CircleDialog(this);
			D.setVisible(true);
			D.setSize(300,400);
		}
		
		else
		{
			Dialog D=new NumberDialog(this);
			D.setVisible(true);
			D.setSize(300,400);
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		dispose();
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
