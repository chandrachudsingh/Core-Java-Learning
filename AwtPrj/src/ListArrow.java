import java.applet.Applet;
import java.awt.List;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;

public class ListArrow extends Applet
{
	Panel P1,P2;
	List ls1,ls2;
	Label lb1,lb2;
	Button bt1,bt2,bt3,bt4;
	
	public void init()
	{
		lb1=new Label("List 1");
		lb1.setForeground(Color.red);
		lb2=new Label("List 2");
		lb2.setForeground(Color.red);
		
		bt1=new Button(">>");
		bt1.setBackground(Color.yellow);
		bt2=new Button("<<");
		bt2.setBackground(Color.yellow);
		bt3=new Button(">>>");
		bt3.setBackground(Color.yellow);
		bt4=new Button("<<<");
		bt4.setBackground(Color.yellow);
		
		ls1=new List();
		ls1.setBackground(Color.blue);
		ls1.add("India");
		ls1.add("Pakistan");
		ls1.add("Australia");
		ls1.add("England");
		ls1.add("New Zealand");
		
		ls2=new List();
		ls2.setBackground(Color.blue);
		ls2.add("Delhi");
		ls2.add("Islamabad");
		ls2.add("Canberra");
		ls2.add("London");
		ls2.add("Wellington");
		
		P1=new Panel();
		P1.setLayout(new GridLayout(2,2,10,10));
		P1.add(lb1);
		P1.add(lb2);
		
		P1.add(ls1);
		P1.add(ls2);
		
		P2=new Panel();
		P2.setLayout(new GridLayout(1,4,10,10));
		P2.add(bt1);
		P2.add(bt2);
		P2.add(bt3);
		P2.add(bt4);
		
		setLayout(new GridLayout(2,1));
		add(P1);
		add(P2);
	}
}
//<applet code="ListArrow.class" width=500 height=500></applet>