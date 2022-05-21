import java.applet.Applet;
import java.awt.Scrollbar;

public class DemoScrollBar extends Applet
{
	Scrollbar sb;
	
	public void init() 
	{
		sb=new Scrollbar();
		add(sb);
		
		System.out.println("Orientation "+sb.getOrientation());
		System.out.println("Unit Increament "+sb.getUnitIncrement());
		System.out.println("Block Increament "+sb.getBlockIncrement());
		System.out.println("Minimum "+sb.getMinimum());
		System.out.println("Maximum "+sb.getMaximum());
		System.out.println("Value "+sb.getValue());
	}
}
