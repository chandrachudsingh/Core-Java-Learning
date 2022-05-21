import java.util.Scanner;

public class Country 
{
	private String name,cap,pm;
	
	public Country()
	{
		name=cap=pm=null;
	}
	public Country(String name, String cap, String pm) 
	{
		this.name=name;
		this.cap=cap;
		this.pm=pm;
	}
	public Country(Country obj) 
	{
		this.name=obj.name;
		this.cap=obj.cap;
		this.pm=obj.pm;
	}
	void readData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Country Name:");
		name=sc.next();
		System.out.println("Enter Capital:");
		cap=sc.next();
		System.out.println("Enter PM:");
		pm=sc.next();
	}
	void showData()
	{
		System.out.println("Country Name="+name);
		System.out.println("Capital="+cap);
		System.out.println("PM="+pm);
	}
}
