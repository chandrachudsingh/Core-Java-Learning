import java.util.Timer;
import java.util.TimerTask;

class Execute extends TimerTask
{
	public static int i=0;
	public void run()
	{
		System.out.println("Timer : "+(++i));
	}
}

public class TimerClass 
{
	public static void main(String[] args)
	{
		Timer T=new Timer();
		TimerTask Task=new Execute();
		
		//schedule(task, start time, delay)
		T.schedule(Task,0,1000);
	}
}
