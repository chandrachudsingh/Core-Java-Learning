import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class CircleForm extends Applet implements ActionListener
{
	Label lbrad,lbresult;
	TextField txrad,txresult;
	Button btpar,btarea,btref,btclose;
	
	public void init()
	{
		setLayout(new GridLayout(3,4,10,20));
		lbrad=new Label("Radius");
		txrad=new TextField(10);
		
		lbresult=new Label("Result");
		txresult=new TextField(10);
		txresult.setEnabled(false);
		
		btarea=new Button("area");
		btpar=new Button("Parameter");
		btref=new Button("Refresh");
		btclose=new Button("Close");
		
		add(lbrad);
		add(new Label());
		add(txrad);
		add(new Label());
		
		add(lbresult);
		add(new Label());
		add(txresult);
		add(new Label());
		
		add(btarea);
		add(btpar);
		add(btref);
		add(btclose);
		
		txrad.requestFocus();    //for placing the cursor in txrad at start
		
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
				float r=Float.parseFloat(txrad.getText());
				float area=3.14f*r*r;
				txresult.setText(area+"");
			}
			
			else if(src==btpar)
			{
				float r=Float.parseFloat(txrad.getText());
				float par=2*3.14f*r;
				txresult.setText(par+"");
			}
			
			else if(src==btref)
			{
				txrad.setText("");
				txresult.setText("");
				txrad.requestFocus();
			}
			
			else
			{
				System.exit(0);
			}
		}
}
//<applet code="CircleForm.class" width=300 height=300></applet>