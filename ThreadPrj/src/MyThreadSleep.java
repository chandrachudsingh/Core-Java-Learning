public class MyThreadSleep extends Thread
{
	MyThreadSleep(String nm)
	{
		setName(nm);
		start();
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+"\t"+getName());
			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
