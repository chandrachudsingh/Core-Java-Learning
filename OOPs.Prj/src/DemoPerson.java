public class DemoPerson 
{
	public static void main(String[] args)
	{
		Person P1=new Person();
		P1.readPerson();
		P1.showPerson();
		
		Person P2=new Person("anil", 22, "jnv");
		P2.showPerson();
		
		Person P3=new Person(P1);
		P3.showPerson();
	}
}
