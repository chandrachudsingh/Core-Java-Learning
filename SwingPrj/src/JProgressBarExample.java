import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JProgressBarExample extends JFrame
{
	JProgressBar jpb=new JProgressBar(0,1000);
	
	public JProgressBarExample() 
	{
		setSize(250, 250);
		setVisible(true);
		
		jpb.setBounds(25,50, 180, 50);
		jpb.setValue(50);
		jpb.setStringPainted(true);            //for the percentage fill in the progressbar
		add(jpb);
		
		setLayout(null); 
	}
	
	public void fill()
	{
		int i=jpb.getValue()*10;
		while(i<=1000)
		{
			jpb.setValue(i);
			i+=10;
			try 
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		JProgressBarExample P=new JProgressBarExample();
		P.fill();
	}
}