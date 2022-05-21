import java.applet.Applet;
import java.awt.List;
import java.awt.Panel;
import java.awt.Label; 
import java.awt.TextField;
import java.awt.Color;
import java.awt.GridLayout;

public class ListCountryCapital extends Applet 
{
	Panel P;
	List lscount,lscap;
	Label lbcount,lbcap,lbcountname,lbcapname;
	TextField txcountname,txcapname;
	
	public void init()
	{
		lbcount=new Label("Country");
		lbcount.setForeground(Color.red);
		lbcap=new Label("Capital");
		lbcap.setForeground(Color.red);
		lbcountname=new Label("Country name is");
		lbcountname.setForeground(Color.blue);
		lbcapname=new Label("Capital is");
		lbcapname.setForeground(Color.blue);
		
		lscount=new List();
		lscount.setBackground(Color.yellow);
		lscount.add("India");
		lscount.add("Pakistan");
		lscount.add("Australia");
		lscount.add("England");
		lscount.add("New Zealand");
		
		lscap=new List();
		lscap.setBackground(Color.yellow);
		lscap.add("Delhi");
		lscap.add("Islamabad");
		lscap.add("Canberra");
		lscap.add("London");
		lscap.add("Wellington");
		
		txcountname=new TextField();
		txcapname=new TextField();
		
		P=new Panel();
		P.setLayout(new GridLayout(4,2,10,10));
		P.add(lbcount);
		P.add(lbcap);
		
		P.add(lscount);
		P.add(lscap);
		
		P.add(lbcountname);
		P.add(txcountname);
		
		P.add(lbcapname);
		P.add(txcapname);
		
		setLayout(new GridLayout(1,1));
		add(P);
	}
}
//<applet code="ListCountryCapital.class" width=500 height=500></applet>