import java.util.Scanner;

public class DemoArea 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter radius of circle");
		
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		
		float area = 3.14f*r*r;
		System.out.print("Area of circle="+area);
	}

}
