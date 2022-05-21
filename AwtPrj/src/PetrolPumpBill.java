import java.applet.Applet;
import java.awt.TextField;
import java.awt.Choice;
import java.awt.Panel;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;

public class PetrolPumpBill extends Applet
{
	Panel P1,P2,P3;
	Choice cbitem;
	Label lbitem,lbrate,lbqty,lbamt,lbst;
	Button btcal,btbill,btref,btclose;
	TextField txrate,txqty,txamt;
	
	public void init()
	{
		cbitem=new Choice();
		cbitem.add("Select Item");
		cbitem.add("Fan");
		cbitem.add("Bulb");
		
		lbst=new Label("PetrolPumpBill");
		lbitem=new Label("Item");
		lbrate=new Label("Rate");
		lbqty=new Label("Qty");
		lbamt=new Label("Amount");
		
		txrate=new TextField();
		txqty=new TextField();
		txamt=new TextField();
		
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
		
		setLayout(new GridLayout(3,1));
		add(P3);
		add(P1);
		add(P2);
	}
}
//<applet code="PetrolPumpBill.class" width=500 height=500></applet>