import java.util.Scanner;

public class Faculty extends Person
{
	private String name;
	private int age;
	private String address;


	public Faculty()
	{
		name=null;
		age=0;
		address=null;
	}
	
	public Faculty(String name,int age,String address,String fname,int fage,String faddress)
	{
		super(name, age, address);
		this.name=fname;
		this.age=fage;
		this.address=faddress;
	}

	public Faculty(Faculty P)
	{
		super(P);
		this.name=P.name;
		this.age=P.age;
		this.address=P.address;
	}
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name:");
		name=sc.next();
		
		System.out.println("Enter age:");
		age=sc.nextInt();
	
		System.out.println("Enter address:");
		address=sc.next();
	}

	void showData()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("address="+address);
	}
}
