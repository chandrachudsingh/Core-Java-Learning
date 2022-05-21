import java.util.Scanner;

public class State extends Country
{
	private String name,cap;
	protected String cm;
	
	public State()
	{
		super();
		name=cap=cm=null;
	}
	public State(String name, String cap, String pm,String sname, String scap, String cm) 
	{
		super(name,cap,pm);
		this.name=sname;
		this.cap=scap;
		this.cm=cm;
	}
	public State(State C1) 
	{
		super(C1);
		this.name=C1.name;
		this.cap=C1.cap;
		this.cm=C1.cm;
	}
	void readData()
	{
		super.readData();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter State Name:");
		name=sc.next();
		System.out.println("Enter Capital:");
		cap=sc.next();
		System.out.println("Enter cm:");
		cm=sc.next();
	}
	void showData()
	{
		super.showData();
		System.out.println("State Name="+name);
		System.out.println("Capital="+cap);
		System.out.println("cm="+cm);
	}
}
