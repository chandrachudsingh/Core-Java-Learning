import java.util.Scanner;

public class Student extends Person
{
	private int rollno;
	private float marks[]=new float[3];
	
	private float total, percent;
	private boolean status;
	
	Student()
	{
		rollno=0;
		for(int i=0;i<marks.length;i++)
			marks[i]=0;
	}

	Student(Student S)
	{
		super(S);
		this.rollno=S.rollno;
		for(int i=0;i<marks.length;i++)
			this.marks[i]=S.marks[i];
		this.total=S.total;
		this.percent=S.percent;
		this.status=S.status;
	}
	
	Student(String name,int age,String address,int rollno, float[] marks)
	{
		super(name, age, address);
		this.rollno=rollno;
		for(int i=0;i<marks.length;i++)
			this.marks[i]=marks[i];
		
		calculate();
	}
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Rollno:");
		rollno=sc.nextInt();
		
		System.out.print("Enter Physics, Chemistry and Maths marks:");
		for(int i=0;i<marks.length;i++)
			marks[i]=sc.nextFloat();
		
		calculate();
	}
	
	void showData()
	{
		System.out.print("Rollno="+rollno);
		
		System.out.print("Physics, Chemistry and Maths marks are:");
		for(int i=0;i<marks.length;i++)
			System.out.println(marks[i]);
		
		System.out.println("Total Marks="+total);
		System.out.println("Percentage="+percent);
		System.out.println("Status="+((status)?"Pass":"Fail"));
	}
	
	private void calculate()
	{
		for(int i=0;i<marks.length;i++)
			total+=marks[i];
		
		percent=(total/300)*100;
		
		if(percent>33.33)
			status=true;
	}
}
