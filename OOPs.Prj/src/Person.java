import java.util.Scanner;

public class Person 
{
		private String name, address;
		private int age;
		
		public Person()
		{
			name=address=null;
			age=0;
		}
		
		public Person(String name,int age,String address)
		{
			this.name=name;
			this.age=age;
			this.address=address;
		}

		public Person(Person P)
		{
			this.name=P.name;
			this.age=P.age;
			this.address=P.address;
		}
		void readPerson()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter name:");
			name=sc.next();
			
			System.out.println("Enter age:");
			age=sc.nextInt();
		
			System.out.println("Enter address:");
			address=sc.next();
		}

		void showPerson()
		{
			System.out.println("name="+name);
			System.out.println("age="+age);
			System.out.println("address="+address);
		}
}
