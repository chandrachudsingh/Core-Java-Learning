import java.applet.Applet;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.GridLayout;

public class CircleDialog extends Dialog implements ActionListener,WindowListener
{
	Label lbrad,lbresult;
	TextField txrad,txresult;
	Button btpar,btarea,btref,btclose;
	
	public CircleDialog(Frame F) 
	{
		super(F);
		setVisible(true);
		setSize(400, 500);
		
		setLayout(new GridLayout(3,4,10,20));
		lbrad=new Label("Radius");
		txrad=new TextField(10);
		
		lbresult=new Label("Radius");
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
		
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) 
		{
			this.dispose();          //For Exiting only Dialog	
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