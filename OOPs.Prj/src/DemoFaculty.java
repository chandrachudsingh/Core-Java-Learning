
public class DemoFaculty 
{
	public static void main(String[] args)
	{
		Faculty S1=new Faculty();
		S1.getData();
		S1.showData();
		
		Faculty S2=new Faculty("ccsc",19,"jnv","abc",30,"MP");
		S2.showData();
		
		Faculty S3=new Faculty(S1);
		S3.showData();
	}
}
