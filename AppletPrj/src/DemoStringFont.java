import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class DemoStringFont extends Applet
{
	public void paint(Graphics g)
	{
		Font F=g.getFont();
		System.out.println("Font name is:"+F.getName());
		System.out.println("Font size is:"+F.getSize());
		System.out.println("Font style is:"+F.getStyle());
		
		Font F1=new Font("ALGERIAN",Font.BOLD+Font.ITALIC,30);
		g.setFont(F1);
		
		setBackground(Color.red);
		setForeground(Color.white);
		g.drawString("Hello",30,40);
		
		if(F.isBold())
			System.out.println("BOLD Style");
		if(F.isItalic())
			System.out.println("Italic Style");
		if(F.isPlain())
			System.out.println("Plain Style");
		
		System.out.println(Font.BOLD);
		System.out.println(Font.PLAIN);
		System.out.println(Font.ITALIC);
	}
}

//<applet code="DemoStringFont.class" width="300" height="300"></applet>