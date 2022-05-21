import java.util.Scanner;

public class District extends State
{
	private String name,MLA;

	public District()
	{
		super();
		name=MLA=null;
	}
	public District(String name, String cap, String pm,String sname, String scap, String cm,String dname, String MLA) 
	{
		super(name,cap,pm,sname, scap, cm);
		this.name=dname;
		this.MLA=MLA;
	}
	public District(District S1) 
	{
		super(S1);
		this.name=S1.name;
		this.MLA=S1.MLA;
	}
	
	void readData()
	{
		super.readData();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter District Name:");
		name=sc.next();
		System.out.println("Enter MLA:");
		MLA=sc.next();
	}
	void showData()
	{
		super.showData();
		System.out.println("District Name="+name);
		System.out.println("MLA="+MLA);
	}
}
