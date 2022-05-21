
public class MyThreadName extends Thread          //predefined class
{
	MyThreadName(String nm)
	{
		setName(nm);
		start();                  //used to call the run(predefined) function
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(i+"\t"+getName());
	}
}
