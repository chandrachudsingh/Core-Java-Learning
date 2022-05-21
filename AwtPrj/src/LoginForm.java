import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

public class LoginForm extends Applet implements FocusListener
{
	Font F;
	Label lbuser,lbpass,lberror;
	TextField txuser,txpass;
	Button btsubmit,btcancel;
	
	public void init()
	{
		F=new Font("ALGERIAN",Font.BOLD,20);
		
		lbuser=new Label("user");
		lbuser.setForeground(Color.magenta);
		lbuser.setFont(F);
		lbpass=new Label("Password");
		lbpass.setForeground(Color.magenta);
		lbpass.setFont(F);
		lberror=new Label();
		lberror.setForeground(Color.RED);
		lberror.setFont(F);
		
		txuser=new TextField(10);
		txpass=new TextField(10);
		txpass.setEchoChar('*');
		
		btsubmit=new Button("Submit");
		btcancel=new Button("Cancel");
		setLayout(new GridLayout(4,2));		

		add(lbuser);
		add(txuser);
		
		add(lbpass);
		add(txpass);
		
		add(btsubmit);
		add(btcancel);
	
		add(lberror);
		
		txuser.requestFocus();
		
		txuser.addFocusListener(this);
		txpass.addFocusListener(this);
	}

	@Override
	public void focusGained(FocusEvent fe) 
	{
		Object src=fe.getSource();
		
		if(src==txpass)
		{
			setBackground(Color.orange);
		}
	}

	@Override
	public void focusLost(FocusEvent fe) 
	{
		Object src=fe.getSource();
		
		if(src==txuser)
		{
			if(txuser.getText().length()>6)
			{
				txuser.requestFocus();
			}
		}
		else 
		{
			String user=txuser.getText();
			String pass=txpass.getText();
			
			if(user.equals(pass))
			{
				lberror.setText("Password cannot be equal to Username");
				txpass.requestFocus();
			}
		}
	}
}

//<applet code="LoginForm.class" width=300 height=300></applet>