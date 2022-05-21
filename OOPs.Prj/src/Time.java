import java.util.Scanner;

public class Time 
{
	private int hr,min,sec;
	
	Time(Time T)
	{
		this.hr=T.hr;
		this.min=T.min;
		this.sec=T.sec;
	}
	Time()
	{
		hr=min=sec=0;
	}
	public Time(int hr, int min, int sec) 
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	void readTime()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter hours,minutes and seconds:");
		hr=sc.nextInt();
		min=sc.nextInt();
		sec=sc.nextInt();
		
		if(hr>12||min>60||sec>60)
		{
			System.out.print("Enter correct time");
			System.exit(0); 
		}
	}
	void showTime()
	{
		System.out.println("Time is: "+hr+":"+min+":"+sec);
	}
	void addTime(Time A,Time B)
	{
		sec=A.sec+B.sec;
		min=A.min+B.min;
		hr=A.hr+B.hr;
		
		min+=sec/60;
		sec%=60;
		
		hr+=min/60;
		min%=60;
		
		System.out.println("Addition of Time is: "+hr+":"+min+":"+sec);
	}
	Time diffTime(Time A, Time B)
	{
		int sec1=A.sec+(A.hr*60*60)+(A.min*60);
		int sec2=B.sec+(B.hr*60*60)+(B.min*60);
		
		sec=sec1-sec2;
		//if(sec2>sec1)
		//	sec*=-1;
		
		sec=(int)Math.abs(sec);
		
		hr=(sec/3600);
		sec%=3600;
		
		min=sec/60;
		sec%=60;
		
		System.out.print("Difference in ");
		return this;
	}
}
