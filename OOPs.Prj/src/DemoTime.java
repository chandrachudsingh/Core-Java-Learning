
public class DemoTime 
{
	public static void main(String[] args)
	{
		Time T1=new Time();
		T1.readTime();
		T1.showTime();

		Time T2=new Time(T1);
		T2.readTime();
		T2.showTime();
		
		Time T3=new Time(2,3,4);
		T3.showTime();
		
		Time T4=new Time();
		T4.addTime(T1,T2);
		
		Time T5=new Time();
		T5.diffTime(T1, T2);
		T5.showTime();
	}
}
