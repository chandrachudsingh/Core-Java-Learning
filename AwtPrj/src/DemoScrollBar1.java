import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class DemoScrollBar1 extends Applet implements AdjustmentListener
{
	Scrollbar sb;
	
	public void init() 
	{
		sb=new Scrollbar();
		add(sb);
		
		sb.setOrientation(Scrollbar.HORIZONTAL);
		sb.setBlockIncrement(20);
		sb.setMinimum(1);
		sb.setMaximum(1000);
		sb.setValue(200);
		sb.setPreferredSize(new Dimension(100,40));
		
		System.out.println("Orientation "+sb.getOrientation());
		System.out.println("Unit Increament "+sb.getUnitIncrement());
		System.out.println("Block Increament "+sb.getBlockIncrement());
		System.out.println("Minimum "+sb.getMinimum());
		System.out.println("Maximum "+sb.getMaximum());
		System.out.println("Value "+sb.getValue());
		
		sb.addAdjustmentListener(this);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent al) 
	{
		showStatus("Current tab value:"+sb.getValue());
	}
}
