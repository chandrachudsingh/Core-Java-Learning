import java.util.Scanner;

public class QuadraticEqn 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a quadratic equation of the format: ax^2+bx+c=0 where a,b,c are arbritary constant");
		
		try
		{
			float a=sc.nextFloat();
			if(a==0)
				throw new MyException("a must be non-zero..");
			
			float b=sc.nextFloat();
			float c=sc.nextFloat();
			float d=b*b-4*a*c;
			
			if(d<0)
				throw new MyException("Imaginary root..");
			
			System.out.println("Roots of the above eqn are: "+((-b+Math.sqrt(d)/(2*a))+"\t"+(-b-Math.sqrt(d)/(2*a))));
		}
		
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}
}
