import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Font;

public class DemoNorthLayout extends Applet
{
	Font f;
	Panel P1,P2,P3,P;
	Label lbn1,lbn2,lbn3;
	
	public void init()
	{
		lbn1=new Label("CEC skill bridge pvt Ltd.");
		lbn1.setBackground(Color.red);
		lbn2=new Label("Computer-Education.com");
		lbn2.setBackground(Color.green);
		lbn3=new Label("The Complete Computer Point");
		lbn3.setBackground(Color.cyan);
		
		f=new Font("Times New Roman",Font.BOLD,30);
		
		P1=new Panel();
		P1.setFont(f);
		P1.add(lbn1);
		
		P2=new Panel();
		P2.setFont(f);
		P2.add(lbn2);
		
		P3=new Panel();
		P3.setFont(f);
		P3.add(lbn3);
		
		P=new Panel();
		P.setLayout(new GridLayout(3,1,10,10));
		P.add(P1);
		P.add(P2);
		P.add(P3);
		
		add(P,BorderLayout.NORTH);
	}
}
//<applet code="DemoNorthLayout.class" width=500 height=500></applet>