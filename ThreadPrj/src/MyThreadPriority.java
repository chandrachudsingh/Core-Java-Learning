
public class MyThreadPriority extends Thread
{
	MyThreadPriority(String nm,int pr)
	{
		setName(nm);
		setPriority(pr);
		start();
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(i+"\t"+getName());
	}
}
