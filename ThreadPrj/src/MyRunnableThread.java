
public class MyRunnableThread implements Runnable 
{
	Thread Th;
	
	MyRunnableThread(String nm)
	{
		Th=new Thread(this,nm);
		Th.start();
	}
	
	public void run()
	{
		for(int i=0;i<=5;i++)
			System.out.println(Th.getName()+"\t"+i);
	}
}
