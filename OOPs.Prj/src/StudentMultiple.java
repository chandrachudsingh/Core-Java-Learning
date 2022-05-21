import java.util.Scanner;

final class StudentMultiple extends Person implements Academic,Sports
{
	int rollno;
	float percent;
	String sp_name;
	String sp_type;
	String Enroll;
	
	public StudentMultiple()
	{
		rollno=0;
		percent=0;
		sp_name=sp_type=Enroll=null;
	}
	
	public StudentMultiple(String name,int age,String address,int rollno,float percent,String Enroll)
	{
		super(name,age,address);
		
		this.Enroll=Enroll;
		this.percent=percent;
		this.rollno=rollno;
		this.sp_name=sp_name;
		this.sp_type=sp_name;
	}
	
	public StudentMultiple(StudentMultiple S)
	{
		super(S);
		
		this.Enroll=S.Enroll;
		this.percent=S.percent;
		this.rollno=S.rollno;
		this.sp_name=S.sp_name;
		this.sp_type=S.sp_name;
	}

	@Override
	public void getSports() 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name of the Sport to participate:");
		sp_name=sc.next();
		
		System.out.println("Enter the type of the Sport to filled above:");
		sp_type=sc.next();
	}

	@Override
	public void showSports() 
	{
		System.out.println("Sports you have Praticipated is "+sp_name);
		System.out.println("Type of Sports you have Praticipated is "+sp_type);
	}

	@Override
	public void getAcademic() 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter branch name:");
		Enroll=sc.next();
		
		System.out.println("Enter rollno name:");
		rollno=sc.nextInt();
		
		System.out.println("Enter percent name:");
		percent=sc.nextFloat();
	}

	@Override
	public void showAcademic() 
	{
		System.out.println("Your College is "+college);
		System.out.println("Your Branch is "+branch);
		System.out.println("Your College is "+Enroll);
		System.out.println("Your Rollno. is "+rollno);
		System.out.println("Your Peercentage is "+percent);
	}
	public void callfnSport()
	{
		getSports();
		showSports();
	}
	public void callfnAcademic()
	{
		getAcademic();
		showAcademic();
	}
	
	public void callfnPerson()
	{
		readPerson();
		showPerson();
	}
}
