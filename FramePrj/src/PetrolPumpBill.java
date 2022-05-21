import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;

public class PetrolPumpBill extends Frame implements ActionListener, ItemListener, WindowListener
{
	Panel P1,P2,P3,P;
	Choice cbitem;
	Label lbitem,lbrate,lbqty,lbamt,lbst;
	Button btcal,btbill,btref,btclose;
	TextField txrate,txqty,txamt;
	
	public PetrolPumpBill()
	{
		setVisible(true);
		setSize(300, 400);
		setTitle("PetrolPumpBill"
				+ "");
		cbitem=new Choice();
		cbitem.add("Select Item");
		cbitem.add("Petrol");
		cbitem.add("Diesel");
		cbitem.add("Gas");
		
		lbst=new Label("PetrolPumpBill");
		lbitem=new Label("Item");
		lbrate=new Label("Rate");
		lbqty=new Label("Qty");
		lbamt=new Label("Amount");
		
		txrate=new TextField();
		txrate.setEnabled(false);
		txqty=new TextField();
		txamt=new TextField();
		txamt.setEnabled(false);
		
		btcal=new Button("Calculate");
		btbill=new Button("Bill");
		btref=new Button("Refresh");
		btclose=new Button("Close");
		
		P3=new Panel();
		P3.add(lbst);
		
		P1=new Panel();
		P1.setLayout(new GridLayout(4,2,10,10));
		P1.add(lbitem);
		P1.add(cbitem);
		
		P1.add(lbrate);
		P1.add(txrate);
		
		P1.add(lbqty);
		P1.add(txqty);
		
		P1.add(lbrate);
		P1.add(txrate);
		
		P1.add(lbamt);
		P1.add(txamt);
		
		P2=new Panel();
		P2.setLayout(new GridLayout(1,4,10,10));
		P2.add(btcal);
		P2.add(btbill);
		P2.add(btref);
		P2.add(btclose);
		
		P=new Panel();
		
		setLayout(new GridLayout(4,1));
		add(P3);
		add(P1);
		add(P2);
		add(P);
		
		cbitem.addItemListener(this);
		
		btcal.addActionListener(this);
		btbill.addActionListener(this);
		btref.addActionListener(this);
		btclose.addActionListener(this);
		
		this.addWindowListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		float rate=0;
		if(cbitem.getSelectedItem()=="Petrol")                  //Method 1
		{
			rate=80;
		}
		
		else if(cbitem.getSelectedItem()=="Diesel")
		{
			rate=70;
		}
		
		else 
		{
			rate=60;
		}
		
		txrate.setText(rate+"");
		txqty.requestFocus();
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Object src=ae.getSource();
		
		if(src==btcal)
		{
			float qty=Float.parseFloat(txqty.getText());
			float rate=Float.parseFloat(txrate.getText());
			
			txamt.setText((qty*rate)+"");
		}
		
		else if(src==btref)
		{
			txrate.setText("");
			txqty.setText("");
			txamt.setText("");
			txqty.requestFocus();
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
//<applet code="PetrolPumpBill.class" width=500 height=500></applet>