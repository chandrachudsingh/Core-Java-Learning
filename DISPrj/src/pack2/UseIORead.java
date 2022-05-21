package pack2;

import pack1.IORead;

public class UseIORead 
{
	public static void main(String[] args)
	{
		IORead S=new IORead();
		int age=S.readInt();
		System.out.println("Your age is "+age);
		
		float sal=S.readFLoat();
		System.out.println("Your Salary is "+sal);

		String name=S.readString();
		System.out.println("Your name is "+name);
	}
}
