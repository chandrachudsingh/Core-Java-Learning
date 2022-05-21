import java.util.Scanner;

public class QuadraticEqn 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Quadratic equation of format 'ax^n+bx+c=0' where n,a,b and"
				+ " c are arbritrary constant");
		
		int n=sc.nextInt();
		try
		{
				float a=sc.nextFloat();
				if(a==0)
					throw new MyException("a must be non zero...");
				float b=sc.nextFloat();
				float c=sc.nextFloat();
		
				float d=b*b-4*a*c;
				if(d<0)
					throw new MyException("Imaginary roots..");
				
				System.out.print("Roots of the above equation are: "+
                     ((-b+Math.sqrt(d))/(2*a))+"\n"+((-b-Math.sqrt(d))/(2*a)));
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}
}
