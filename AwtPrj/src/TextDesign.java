import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TextDesign extends Applet implements ItemListener
{
	Panel P1,P2;
	Choice cbfont,cbsize;
	Label lbfont,lbsize,lbst;
	Checkbox chbold,chitalic;
	
	public void init()
	{
		Font F=new Font("Times New Roman", Font.PLAIN, 10);
		
		lbfont=new Label("Font");
		lbsize=new Label("Size");
		lbst=new Label("Hello");
		lbst.setFont(F);
		
		cbfont=new Choice();
		cbfont.add("Select Font");
		cbfont.add("Roboto");
		cbfont.add("Arial");
		cbfont.add("comic sans");
		
		cbsize=new Choice();
		cbsize.add("Select Font size");
		cbsize.add("10");
		cbsize.add("12");
		cbsize.add("14");
		cbsize.add("16");
		cbsize.add("18");
		cbsize.add("20");
		cbsize.add("22");
		cbsize.add("24");
		
		chbold=new Checkbox("Bold");
		chitalic=new Checkbox("Italic");
		
		P1=new Panel();
		P1.setLayout(new GridLayout(1,6,10,10));
		P1.add(lbfont);
		P1.add(cbfont);
		P1.add(lbsize);
		P1.add(cbsize);
		P1.add(chbold);
		P1.add(chitalic);
		
		P2=new Panel();
		P2.add(lbst);
		
		setLayout(new GridLayout(2,1));
		add(P1);
		add(P2);
		
		cbfont.addItemListener(this);
		cbsize.addItemListener(this);
		chbold.addItemListener(this);
		chitalic.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{	
		String fname=lbst.getFont().getFontName();
		if(cbfont.getSelectedIndex()!=0)
			fname=cbfont.getSelectedItem();
		
		int fsize=lbst.getFont().getSize();
		
		if(cbsize.getSelectedIndex()!=0)
			fsize=Integer.parseInt(cbsize.getSelectedItem());
		
		int fstyle=lbst.getFont().getStyle();
		
		if(chbold.getState())
			fstyle=Font.BOLD;
		if(chitalic.getState())
			fstyle=Font.ITALIC;
		if(chbold.getState()&&chitalic.getState())
			fstyle=Font.ITALIC+Font.BOLD;
		
		Font F=new Font(fname,fstyle,fsize);
		lbst.setFont(F);
	}
}
