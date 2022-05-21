
public class DemoMyThreadJoin {

	public static void main(String[] args)
	{
		try 
		{
			new MyThreadName("first").join();            //Temporary object creation 
			new MyThreadName("Second").join();
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}	
	}
}
