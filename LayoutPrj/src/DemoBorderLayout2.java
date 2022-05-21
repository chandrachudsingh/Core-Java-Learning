import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Font;

public class DemoBorderLayout2 extends Applet
{
	Font f;
	Panel P1,P2,P3,P4,P5;
	Label lbn,lbc,lbs,lbw,lbe;
	
	public void init()
	{
		setBackground(Color.PINK);
		
		lbn=new Label("North Selection");
		lbn.setBackground(Color.red);
		lbs=new Label("South Selection");
		lbs.setBackground(Color.green);
		lbw=new Label("West Selection");
		lbw.setBackground(Color.cyan);
		lbe=new Label("East Selection");
		lbe.setBackground(Color.blue);
		lbc=new Label("Centre Selection");
		lbc.setBackground(Color.yellow);
		
		f=new Font("ALGERIAN",Font.BOLD,30);
		
		P1=new Panel();
		P1.setFont(f);
		P1.add(lbn);
		
		P2=new Panel();
		P2.setFont(f);
		P2.add(lbw);
		
		P3=new Panel();
		P3.setFont(f);
		P3.add(lbc);
		
		P4=new Panel();
		P4.setFont(f);
		P4.add(lbe);
		
		P5=new Panel();
		P5.setFont(f);
		P5.add(lbs);
		
		setLayout(new BorderLayout());
		add(P1,BorderLayout.NORTH);
		add(P2,BorderLayout.WEST);
		add(P3,BorderLayout.CENTER);
		add(P4,BorderLayout.EAST);
		add(P5,BorderLayout.SOUTH);
	}
	
	public Insets getInsets()                           //For providing the margin at each sides
	{
		return new Insets(100, 200, 300, 400);
	}
}
//<applet code="DemoBorderLayout2.class" width=500 height=500></applet>