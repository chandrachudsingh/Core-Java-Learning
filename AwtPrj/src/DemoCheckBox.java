import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DemoCheckBox extends Applet implements ItemListener
{
	Checkbox chmusic,chread,chdance;
	Label lb;
	
	public void init()
	{
		chmusic=new Checkbox("Music");
		chread=new Checkbox("Reading");
		chdance=new Checkbox("Dance");
		
		lb=new Label();
		
		add(new Label("Hobbies"));
		add(chmusic);
		add(chread);
		add(chdance);
		add(lb);
		
		chmusic.addItemListener(this);
		chread.addItemListener(this);
		chdance.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		/*if(chmusic.getState())
			lb.setText("Hobby is Music");
		if(chread.getState())
			lb.setText("Hobby is Reading");
		if(chdance.getState())
			lb.setText("Hobby is Dancing");
		if(chmusic.getState()&&chread.getState())
			lb.setText("Hobbies are Music and Reading");
		if(chmusic.getState()&&chdance.getState())
			lb.setText("Hobbies are Music and Dancing");
		if(chread.getState()&&chdance.getState())
			lb.setText("Hobbies are Reading and Dancing");
		if(chmusic.getState()&&chread.getState()&&chdance.getState())
			lb.setText("Hobbies are Music, Reading and Dancing");
		else 
		 	lb.setText("");   */
		
		String str="Hobbies are ";
		if(chmusic.getState())
			str+="Music ";
		if(chread.getState())
			str+="Reading ";
		if(chdance.getState())
			str+="Dancing ";
		if (!chmusic.getState()&&!chread.getState()&&!chdance.getState());
			str="Please select your Hobbies";
		lb.setText(str);
		validate();
	}
}
//<applet code="DemoCheckBox.class" width=500 height=500></applet>