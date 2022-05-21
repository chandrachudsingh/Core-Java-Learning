import java.applet.Applet;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Choice;
import java.awt.Panel;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;

public class PetrolPumpBill2 extends Applet implements ActionListener, ItemListener
{
	Panel P1,P2,P3,P;
	Choice cbitem;
	Label lbitem,lbrate,lbqty,lbamt,lbitem2,lbrate2,lbqty2,lbtotbill,lbst;
	Button btcal,btbill,btref,btclose;
	TextField txrate,txqty,txamt,txitem2,txrate2,txqty2,txtotbill;
	
	public void init()
	{
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
		lbitem2=new Label("");
		lbitem2.setVisible(false);
		lbrate2=new Label("");
		lbrate2.setVisible(false);
		lbqty2=new Label("");
		lbqty2.setVisible(false);
		lbtotbill=new Label("");
		lbtotbill.setVisible(false);
		
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
		P.setLayout(new GridLayout(4,1,10,10));
		P.add(lbitem2);
		P.add(lbrate2);
		P.add(lbqty2);
		P.add(lbtotbill);
		
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
		
		else if(src==btbill)
		{
			if(cbitem.getSelectedIndex()!=0||txqty.getText()!=null||txamt.getText()!=null)
			{
				lbitem2.setText("Item :- "+cbitem.getSelectedItem());
				lbitem2.setVisible(true);
				lbrate2.setText("Rate :- "+txrate.getText());
				lbrate2.setVisible(true);
				lbqty2.setText("Qty :- "+txqty.getText());
				lbqty2.setVisible(true);
				lbtotbill.setText("Total Bill :- "+txamt.getText());
				lbtotbill.setVisible(true);
			}
		}
		
		else if(src==btref)
		{
			txrate.setText("");
			txqty.setText("");
			txamt.setText("");
			
			cbitem.select(0);
			txqty.requestFocus();
			
			lbitem2.setVisible(false);
			lbqty2.setVisible(false);
			lbrate2.setVisible(false);
			lbtotbill.setVisible(false);
		}
		
		else
		{
			System.exit(0);
		}
	}
}
//<applet code="PetrolPumpBill2.class" width=500 height=500></applet>