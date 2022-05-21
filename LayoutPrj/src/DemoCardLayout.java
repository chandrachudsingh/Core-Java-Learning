import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoCardLayout extends Applet implements ActionListener
{
	Panel Pn,Pc;
	Button btfirst,btlast,btnext,btprev,btclose;
	CardLayout CLO;
	
	public void init()
	{	
		btfirst=new Button("First");
		btnext=new Button("Next");
		btlast=new Button("Last");
		btprev=new Button("Previous");
		btclose=new Button("Close");
		
		Pn=new Panel();
		Pn.add(btfirst);
		Pn.add(btnext);
		Pn.add(btlast);
		Pn.add(btprev);
		Pn.add(btclose);
		
		Pc=new Panel();
		CLO=new CardLayout();
		Pc.setLayout(CLO);
		
		Pc.add(new AdmissionPanel());
		Pc.add(new AOPPanel());
		Pc.add(new CirclePanel());
		Pc.add(new MaxMinPanel());
		Pc.add(new NumberPanel());
		Pc.add(new SwapPanel());
		Pc.add(new RectanglePanel());
		Pc.add(new PetrolPumpBillPanel());
		
		setLayout(new BorderLayout());
		add(Pn,BorderLayout.NORTH);
		add(Pc,BorderLayout.CENTER);
		
		btfirst.addActionListener(this);
		btnext.addActionListener(this);
		btlast.addActionListener(this);
		btprev.addActionListener(this);
		btclose.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Object src=ae.getSource();
		
		if(src==btfirst)
			CLO.first(Pc);
		else if(src==btnext)
			CLO.next(Pc);
		else if(src==btlast)
			CLO.last(Pc);
		else if(src==btprev)
			CLO.previous(Pc);
		else
			System.exit(0);
	}
}
//<applet code="DemoCardLayout.class" width=500 height=500></applet>