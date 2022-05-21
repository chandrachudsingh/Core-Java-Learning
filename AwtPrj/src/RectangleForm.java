import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class RectangleForm extends Applet implements ActionListener
{
	Panel P1,P2;
	
	Label lblen,lbbread,lbresult;
	TextField txlen,txbread,txresult;
	Button btarea,btpar,btref,btclose;
	
	public void init()
	{
		lblen=new Label("Length");
		txlen=new TextField(10);
		
		lbbread=new Label("Breadth");
		txbread=new TextField(10);
		
		lbresult=new Label("Result");
		txresult=new TextField(10);
		txresult.setEnabled(false);
		
		btarea=new Button("Area");
		btpar=new Button("Parameter");
		btref=new Button("Refresh");
		btclose=new Button("Close");
		
		P1=new Panel();
		P1.setLayout(new GridLayout(3,2,10,10));
		P1.add(lblen);
		P1.add(txlen);
		
		P1.add(lbbread);
		P1.add(txbread);
		
		P1.add(lbresult);
		P1.add(txresult);
		
		P2=new Panel();
		P2.setLayout(new GridLayout(1,4,10,10));
		P2.add(btarea);
		P2.add(btpar);
		P2.add(btref);
		P2.add(btclose);
		
		setLayout(new GridLayout(2,1));
		add(P1);
		add(P2);
		
		txlen.requestFocus();
		
		btarea.addActionListener(this);
		btpar.addActionListener(this);
		btref.addActionListener(this);
		btclose.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Object src=ae.getSource();
		
		if(src==btarea)
		{
			float l=Integer.parseInt(txlen.getText());
			float b=Integer.parseInt(txbread.getText());
			txresult.setText((l*b)+"");
		}
		
		else if(src==btpar)
		{
			float l=Integer.parseInt(txlen.getText());
			float b=Integer.parseInt(txbread.getText());
			txresult.setText((2*(l+b))+"");
		}
		
		else if(src==btref)
		{
			txlen.setText("");
			txbread.setText("");
			txresult.setText("");
			txlen.requestFocus();
		}
		
		else
		{
			System.exit(0);
		}
	}
}
//<applet code="RectangleForm.class" width=500 height=500></applet>