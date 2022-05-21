
public class DemoStudent 
{
	public static void main(String[] args)
	{
		Student S1=new Student();
		S1.getData();
		S1.showData();
		
		float []m= {45,99,77};
		Student S2=new Student("ccsc",19,"jnv",1,m);
		S2.showData();
		
		Student S3=new Student(S1);
		S3.showData();
	}
}
