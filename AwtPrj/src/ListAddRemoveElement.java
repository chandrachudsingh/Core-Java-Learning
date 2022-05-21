import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;

public class ListAddRemoveElement extends Applet
{
	Panel P1,P2;
	Label lbst,lbelmt;
	TextField txelmt;
	Button btadd,btremove;
	List ls;
	
	public void init()
	{
		lbst=new Label("Identity");
		lbst.setForeground(Color.red);
		lbelmt=new Label("Element");
		lbelmt.setForeground(Color.red);
		
		txelmt=new TextField();
		
		ls=new List();
		ls.setBackground(Color.green);
		ls.add("Aadhar card");
		ls.add("Pan card");
		ls.add("Marksheet");
		ls.add("Voter Id");
		
		btadd=new Button("Add");
		btadd.setBackground(Color.yellow);
		btremove=new Button("Remove");
		btremove.setBackground(Color.yellow);
		
		P1=new Panel();
		P1.setLayout(new GridLayout(1,1));
		P1.add(lbst);
		
		P2=new Panel();
		P2.setLayout(new GridLayout(2,3,10,10));
		P2.add(ls);
		P2.add(lbelmt);
		P2.add(txelmt);

		P2.add(btadd);
		P2.add(btremove);
		
		setLayout(new GridLayout(2,1));
		add(P1);
		add(P2);
	}
}
//<applet code="ListAddRemoveElement.class" width=500 height=500></applet>