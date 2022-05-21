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

public class NumberDialog extends Dialog implements ActionListener, WindowListener
{
	Panel P1,P2;
	
	Label lbnum,lbresult;
	TextField txnum,txresult;
	Button btprime,btfact,btref,btclose;
	
	public NumberDialog(Frame F)
	{
		super(F);
		setVisible(true);
		setSize(400, 500);
		
		lbnum=new Label("Number");
		txnum=new TextField();
		
		lbresult=new Label("Result");
		txresult=new TextField();
		txresult.setEnabled(false);
		
		btprime=new Button("Prime");
		btfact=new Button("Factorial");
		btref=new Button("Refresh");
		btclose=new Button("Close");
		
		P1=new Panel();
		P1.setLayout(new GridLayout(2,2,10,10));
		P1.add(lbnum);
		P1.add(txnum);
		
		P1.add(lbresult);
		P1.add(txresult);
		
		P2=new Panel();
		P2.setLayout(new GridLayout(1,4,10,10));
		P2.add(btprime);
		P2.add(btfact);
		P2.add(btref);
		P2.add(btclose);
		
		setLayout(new GridLayout(2,1));
		add(P1);
		add(P2);
		
		txnum.requestFocus();
		
		btprime.addActionListener(this);
		btfact.addActionListener(this);
		btref.addActionListener(this);
		btclose.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Object src=ae.getSource();
		
		if(src==btprime)
		{
			int num=Integer.parseInt(txnum.getText());
			
			if(num>1)
			{
				int flag=0;
				for(int x=2;x<num/2;x++)
				{
					if(num%x==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
					txresult.setText("Prime");
				else
					txresult.setText("Not Prime");
			}
			else
				txresult.setText("Not Prime");
		}
		
		else if(src==btfact)
		{
			int num=Integer.parseInt(txnum.getText());
			int fact=1;
			
			for(int i=2;i<=num;i++)
				fact*=i;
			txresult.setText(fact+"");
		}
		
		else if(src==btref)
		{
			txnum.setText("");
			txresult.setText("");
			txnum.requestFocus();
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