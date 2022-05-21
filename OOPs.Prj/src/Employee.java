import java.util.Scanner;

public class Employee extends Person
{
	private int emp_id;
	String desg;
	float salary;
	char grade;
	
	public Employee()
	{
		emp_id=0;
		desg=null;
		salary=0;
		grade=' ';
	}
	public Employee(Employee E1) 
	{
		super(E1);
		this.emp_id=E1.emp_id;
		this.desg=E1.desg;
		this.salary=E1.salary;
		this.grade=E1.grade;
	}
	public Employee(String name,int age,String address,int emp_id,String desg,float salary,char grade)
	{
		super(name,age,address);//base constructor
		
		this.emp_id=emp_id;
		this.desg=desg;
		this.salary=salary;
		this.grade=grade;
	}
	void getData()
	{
		super.readPerson();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter employee ID:");
		emp_id=sc.nextInt();
		System.out.println("Enter Designation:");
		desg=sc.next();
		System.out.println("Enter Salary:");
		salary=sc.nextFloat();
		System.out.println("Enter grade:");
		grade=sc.next().charAt(0);
	}
	void showData()
	{
		super.showPerson();
		System.out.println("employee ID="+emp_id);
		System.out.println("Designation="+desg);
		System.out.println("Salary="+salary);
		System.out.println("grade="+grade);
	}
}
