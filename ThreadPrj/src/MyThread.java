
public class MyThread extends Thread
{
	MyThread()
	{
		start();
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(i+"\t"+getName());
	}
}
