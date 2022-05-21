import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class JSliderExample extends JFrame
{
	JSlider js=new JSlider(JSlider.HORIZONTAL,0,50,25);
	
	public JSliderExample()
	{
		setSize(400, 300);
		setVisible(true);
		
		/* js.setMinorTickSpacing(2);         //used to space the minor ticks
		js.setMajorTickSpacing(10);		   //used to space the major ticks
		js.setPaintTicks(true);            //used to paint the minor ticks
		js.setPaintLabels(true);           //used to paint the major ticks  */
		
		JPanel P=new JPanel();
		P.add(js);
		add(P);
	}
	
	public static void main(String[] args)
	{
		JSliderExample S=new JSliderExample();
		S.pack();                  //to fit window exactly to the size of its components
	}
}
