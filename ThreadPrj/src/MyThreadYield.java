
public class MyThreadYield extends Thread
{
	MyThreadYield(String nm)
	{
		setName(nm);
		start();
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+"\t"+getName());
			yield();
		}
	}
}
