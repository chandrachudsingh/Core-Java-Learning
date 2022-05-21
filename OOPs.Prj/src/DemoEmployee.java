
public class DemoEmployee 
{
	public static void main(String[]args)
	{
		Employee E1=new Employee();
		E1.getData();
		E1.showData();
	
		Employee E2=new Employee(E1);
		E2.showData();
		
		Employee E3=new Employee("anil",23,"jnv",1234,"Emp",10000,'D');
		E3.showData();
	}
}
