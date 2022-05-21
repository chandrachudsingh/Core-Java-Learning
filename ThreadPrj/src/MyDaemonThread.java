
public class MyDaemonThread extends Thread
{
	MyDaemonThread()
	{
		//setDaemon(true);      till the Daemon is true the main will not be closed
		start();
	}
	
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i);
			i++;
		}
	}
}
