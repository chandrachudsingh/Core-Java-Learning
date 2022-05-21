
public class DemoThreadPriority 
{
	public static void main(String[] args)
	{
		Thread Th1=new MyThreadPriority("First",Thread.MIN_PRIORITY);
		Thread Th2=new MyThreadPriority("Second",Thread.NORM_PRIORITY);
		Thread Th3=new MyThreadPriority("Third",Thread.MAX_PRIORITY);
	}
}
