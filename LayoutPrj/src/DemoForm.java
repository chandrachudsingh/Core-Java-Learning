import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Font;

public class DemoForm extends Applet
{
	Font f;
	Panel Pn[],Pw[],Pc,Pe[],Ps,P1,P2,P3,P4,P5;
	Label lbn[],lbc,lbs;
	Button btw[],bte[];
	
	public void init()
	{
		f=new Font("ALGERIAN",Font.BOLD,20);
		
		lbn=new Label[3];
		lbn[0]=new Label("CEC skill bridge pvt Ltd.");
		lbn[0].setBackground(Color.red);
		lbn[1]=new Label("Computer-Education.com");
		lbn[1].setBackground(Color.green);
		lbn[2]=new Label("The Complete Computer Point");
		lbn[2].setBackground(Color.cyan);
		
		lbc=new Label("Form");
		lbc.setBackground(Color.blue);
		lbs=new Label("Address");
		lbs.setBackground(Color.MAGENTA);
		
		btw=new Button[4];
		for(int i=0;i<4;i++)
		{
			btw[i]=new Button("W"+Integer.toString(i));
			btw[i].setBackground(Color.yellow);
		}
		
		bte=new Button[4];
		for(int i=0;i<4;i++)
		{
			bte[i]=new Button("E"+Integer.toString(i));
			bte[i].setBackground(Color.yellow);
		}
		
		Pn=new Panel[3];
		for(int i=0;i<3;i++)
		{
			Pn[i]=new Panel();
			Pn[i].setFont(f);
			Pn[i].add(lbn[i]);
		}
		
		Pw=new Panel[4];
		for(int i=0;i<4;i++)
		{
			Pw[i]=new Panel();
			Pw[i].add(btw[i]);
		}
		
		Pc=new Panel();
		Pc.setFont(new Font("Times New Roman",Font.ITALIC,20));
		Pc.add(lbc);
		
		Pe=new Panel[4];
		for(int i=0;i<4;i++)
		{
			Pe[i]=new Panel();
			Pe[i].add(btw[i]);
		}
		
		Ps=new Panel();
		Ps.setFont(new Font("Times New Roman",Font.ITALIC,20));
		Ps.add(lbs);
		
		P1=new Panel();
		P1.setLayout(new GridLayout(3,1,5,5));
		for(int i=0;i<3;i++)
			P1.add(Pn[i]);
		
		P2=new Panel();
		P2.setLayout(new GridLayout(4,1,10,10));
		for(int i=0;i<4;i++)
			P2.add(btw[i]);
		
		P3=new Panel();
		P3.add(lbc);
		
		P4=new Panel();
		P4.setLayout(new GridLayout(4,1,10,10));
		for(int i=0;i<4;i++)
			P4.add(bte[i]);
		
		P5=new Panel();
		P5.add(lbs);
		
		setLayout(new BorderLayout());
		add(P1,BorderLayout.NORTH);
		add(P2,BorderLayout.WEST);
		add(P3,BorderLayout.CENTER);
		add(P4,BorderLayout.EAST);
		add(P5,BorderLayout.SOUTH);
	}
}
//<applet code="DemoForm.class" width=500 height=500></applet>