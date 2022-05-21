
public class ThreadFunctions extends Thread
{
	ThreadFunctions(String nm)
	{
		setName(nm);
		start();     //calling of run method
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"\t"+getName());
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			if(i==8)
			{
				System.out.println("Kill");
				stop();
			}
		}
	}
}
