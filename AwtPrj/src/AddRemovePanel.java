import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRemovePanel extends Applet implements ActionListener
{
	Panel P1,P2,P3;
	Button btadd,btremove;
	
	public void init()
	{
		btadd=new Button("Add");
		btremove=new Button("Remove");
		
		P1=new Panel();
		P1.add(new Label("Panel 1"));

		P2=new Panel();
		P2.add(new Label("Panel 2"));
		
		P3=new Panel();
		P3.add(new Label("Panel 3"));
		
		add(btadd);
		add(btremove);
		add(P1);
		add(P2);
		add(P3);
		
		btadd.addActionListener(this);
		btremove.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Object src=ae.getSource();
		
		if(src==btremove)
		{
			if(P2!=null)
			{
				remove(P2);
				P2=null;
			}
		}
		else
		{
			if(P2==null)
			{
				P2=new Panel();
				P2.add(new Label("Panel 2"));
				add(P2);
			}
			
		}
		validate();
	}		
	
}
