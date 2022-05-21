
public class DemoThreadFunction 
{
	public static void main(String[] args)
	{
		try
		{
			
			Thread Th=new ThreadFunctions("First");
			System.out.println("Main thread in sleep mode for 3 sec");
			Thread.sleep(3000);
			
			System.out.println("Thread in suspended mode");
			Th.suspend();
			
			System.out.println("Main thread in sleep mode for 3 sec");
			Thread.sleep(3000);
			
			if(Th.isAlive())
				System.out.println("Alive mode");
			else 
				System.out.println("Dead mode");
			
			System.out.println("Thread in resume mode");
			Th.resume();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}
