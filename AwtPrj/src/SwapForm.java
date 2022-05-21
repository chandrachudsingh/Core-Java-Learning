import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class SwapForm extends Applet implements ActionListener
{
	Panel P1,P2,P3,P4,P5;
	
	Label lbst1,lbst2,lbfirst1,lbsecond1,lbfirst2,lbsecond2;
	TextField txfirst1,txfirst2,txsecond1,txsecond2;
	Button btswap,btref,btclose;
	
	public void init()
	{
		lbst1=new Label("Before Swapping");
		
		lbfirst1=new Label("First No.");
		txfirst1=new TextField(10);
		
		lbsecond1=new Label("Second No.");
		txsecond1=new TextField(10);
		
		btswap=new Button("Swap");
		btref=new Button("Refresh");
		btclose=new Button("Close");
		
		lbst2=new Label("After Swapping");
		
		lbfirst2=new Label("First No.");
		txfirst2=new TextField(10);
		txfirst2.setEnabled(false);
		
		lbsecond2=new Label("Second No.");
		txsecond2=new TextField(10);
		txsecond2.setEnabled(false);
		
		P1=new Panel();
		P1.setLayout(new GridLayout(1,1,10,10));
		P1.add(lbst1);
		
		P2=new Panel();
		P2.setLayout(new GridLayout(2,2,10,10));
		P2.add(lbfirst1);
		P2.add(txfirst1);
		
		P2.add(lbsecond1);
		P2.add(txsecond1);
		
		P3=new Panel();
		P3.setLayout(new GridLayout(1,3,10,10));
		P3.add(btswap);
		P3.add(btref);
		P3.add(btclose);
		
		P4=new Panel();
		P4.setLayout(new GridLayout(1,1,10,10));
		P4.add(lbst2);
		
		P5=new Panel();
		P5.setLayout(new GridLayout(2,2,10,10));
		P5.add(lbfirst2);
		P5.add(txfirst2);
		
		P5.add(lbsecond2);
		P5.add(txsecond2);
		
		setLayout(new GridLayout(5,1));
		add(P1);
		add(P2);
		add(P3);
		add(P4);
		add(P5);
		
		txfirst1.requestFocus();
		P4.setVisible(false);
		P5.setVisible(false);
		
		btswap.addActionListener(this);
		btref.addActionListener(this);
		btclose.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Object src=ae.getSource();
		
		if(src==btswap)
		{
			P4.setVisible(true);
			P5.setVisible(true);
			float a=Float.parseFloat(txfirst1.getText());
			float b=Float.parseFloat(txsecond1.getText());
			txfirst2.setText(b+"");
			txsecond2.setText(a+"");
		}
		
		else if(src==btref)
		{
			P4.setVisible(false);
			P5.setVisible(false);
			txfirst1.setText("");
			txsecond1.setText("");
			txfirst2.setText("");
			txsecond2.setText("");
			txfirst1.requestFocus();
		}
		
		else
		{
			System.exit(0);
		}
	}
}
//<applet code="SwapForm.class" width=500 height=500></applet>