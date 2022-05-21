import java.applet.Applet;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.GridLayout;

public class MaxMinDialog extends Dialog implements ActionListener, WindowListener
{
	Panel P1,P2;
	
	Label lbfirst,lbsecond,lbthird,lbresult;
	TextField txfirst,txsecond,txthird,txresult;
	Button btmax,btmin,btref,btclose;
	
	public MaxMinDialog(Frame F)
	{
		super(F);
		setVisible(true);
		setSize(400, 500);
		
		lbfirst=new Label("First No.");
		txfirst=new TextField();
		
		lbsecond=new Label("Second No.");
		txsecond=new TextField();
		
		lbthird=new Label("Third No.");
		txthird=new TextField();
		
		lbresult=new Label("Result");
		txresult=new TextField();
		txresult.setEnabled(false);
		
		btmax=new Button("Max");
		btmin=new Button("Min");
		btref=new Button("Refresh");
		btclose=new Button("Close");
		
		P1=new Panel();
		P1.setLayout(new GridLayout(4,2,10,10));
		P1.add(lbfirst);
		P1.add(txfirst);
		
		P1.add(lbsecond);
		P1.add(txsecond);
		
		P1.add(lbthird);
		P1.add(txthird);
		
		P1.add(lbresult);
		P1.add(txresult);
		
		P2=new Panel();
		P2.setLayout(new GridLayout(1,4,10,10));
		P2.add(btmax);
		P2.add(btmin);
		P2.add(btref);
		P2.add(btclose);
		
		setLayout(new GridLayout(2,1));
		add(P1);
		add(P2);
		
		txfirst.requestFocus();
		
		btmax.addActionListener(this);
		btmin.addActionListener(this);
		btref.addActionListener(this);
		btclose.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Object src=ae.getSource();
		
		if(src==btmax)
		{
			int num1=Integer.parseInt(txfirst.getText());
			int num2=Integer.parseInt(txsecond.getText());
			int num3=Integer.parseInt(txthird.getText());
			
			if(num1>num2&&num1>num3)
				txresult.setText(num1+"");
			else if(num2>num3)
				txresult.setText(num2+"");
			else
				txresult.setText(num3+"");
		}
		
		else if(src==btmin)
		{
			float num1=Float.parseFloat(txfirst.getText());
			float num2=Float.parseFloat(txsecond.getText());
			float num3=Float.parseFloat(txthird.getText());
			
			if(num1<num2&&num1<num3)
				txresult.setText(num1+"");
			else if(num2<num3)
				txresult.setText(num2+"");
			else
				txresult.setText(num3+"");
		}
		
		else if(src==btref)
		{
			txfirst.setText("");
			txsecond.setText("");
			txthird.setText("");
			txresult.setText("");
			txfirst.requestFocus();
		}
		
		else
		{
			System.exit(0);
		}
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		dispose();          //For Exiting only Dialog	
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