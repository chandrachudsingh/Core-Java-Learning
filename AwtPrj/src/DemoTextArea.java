import java.applet.Applet;
import java.awt.TextArea;
import java.awt.GridLayout;
import java.awt.Label;

public class DemoTextArea extends Applet
{
	TextArea txfeed;
	
	public void init()
	{
		txfeed=new TextArea();
		add(new Label("Feedback"));
		add(txfeed);
	}
}
//<applet code="DemoTextArea.class" width=300 height=300></applet>