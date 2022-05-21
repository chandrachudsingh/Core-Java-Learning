import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.Panel;

public class AOPPanel extends Panel implements ActionListener
{
	Panel P1,P2,P3;
	
	Label lbfirst,lbsecond,lbresult;
	TextField txfirst,txsecond,txresult;
	Button btplus,btminus,btmul,btdiv,btmod,btref,btclose;
	
	public AOPPanel()
	{
		setLayout(new GridLayout(3,4,10,20));
		lbfirst=new Label("First Number");
		txfirst=new TextField(10);
		
		lbsecond=new Label("Second Number");
		txsecond=new TextField(10);
		
		lbresult=new Label("Result");
		txresult=new TextField(10);
		
		btplus=new Button("+");
		btminus=new Button("-");
		btmul=new Button("*");
		btdiv=new Button("/");
		btmod=new Button("%");
		
		btref=new Button("Refresh");
		btclose=new Button("Close");
		
		P1=new Panel();
		P1.setLayout(new GridLayout(3,2,10,10));
		
		P1.add(lbfirst);
		P1.add(txfirst);
		
		P1.add(lbsecond);
		P1.add(txsecond);
		
		P1.add(lbresult);
		P1.add(txresult);
		
		P2=new Panel();
		P2.setLayout(new GridLayout(1,5,10,10));
		
		P2.add(btplus);
		P2.add(btminus);
		P2.add(btmul);
		P2.add(btdiv);
		P2.add(btmod);
		
		P3=new Panel();
		P3.setLayout(new GridLayout(1,2,10,10));
		
		P3.add(btref);
		P3.add(btclose);
		
		setLayout(new GridLayout(3,1));
		add(P1);
		add(P2);
		add(P3);
		
		txfirst.requestFocus();
		
		btplus.addActionListener(this);
		btminus.addActionListener(this);
		btmul.addActionListener(this);
		btdiv.addActionListener(this);
		btmod.addActionListener(this);
		
		btref.addActionListener(this);
		btclose.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
			Object src=ae.getSource();
			
			if(src==btplus)
			{
				float a=Float.parseFloat(txfirst.getText());
				float b=Float.parseFloat(txsecond.getText());
				txresult.setText((a+b)+"");
			}
			
			else if(src==btminus)
			{
				float a=Float.parseFloat(txfirst.getText());
				float b=Float.parseFloat(txsecond.getText());
				txresult.setText((a-b)+"");
			}
			
			else if(src==btmul)
			{
				float a=Float.parseFloat(txfirst.getText());
				float b=Float.parseFloat(txsecond.getText());
				txresult.setText((a*b)+"");
			}
			
			else if(src==btdiv)
			{
				float a=Float.parseFloat(txfirst.getText());
				float b=Float.parseFloat(txsecond.getText());
				txresult.setText((a/b)+"");
			}
			
			else if(src==btmod)
			{
				float a=Float.parseFloat(txfirst.getText());
				float b=Float.parseFloat(txsecond.getText());
				txresult.setText((a%b)+"");
			}
			
			else if(src==btref)
			{
				txfirst.setText("");
				txsecond.setText("");
				txresult.setText("");
				txfirst.requestFocus();
			}
			
			else
			{
				System.exit(0);
			}
	}
}