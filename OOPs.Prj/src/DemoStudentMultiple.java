
public class DemoStudentMultiple 
{
	public static void main(String[] args)
	{
		StudentMultiple S1=new StudentMultiple();
		//S1.getSports();
		//S1.showSports();
		S1.callfnSport();
	
		StudentMultiple S2=new StudentMultiple();
		//S2.getAcademic();
		//S2.showAcademic();
		S2.callfnAcademic();
		
		StudentMultiple S3=new StudentMultiple();
		//S3.readPerson();
		//S3.showPerson();
		S3.callfnPerson();
		
		StudentMultiple S4=new StudentMultiple("anil", 22, "jnv", 15, 80,"ECB/01/2018/015");
		S4.showPerson();
		
		StudentMultiple S5=new StudentMultiple(S3);
		S5.showPerson();
	}
}
