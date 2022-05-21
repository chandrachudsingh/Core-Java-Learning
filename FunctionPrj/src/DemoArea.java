import java.util.Scanner;

public class DemoArea 
{
	public static float Areaofcircle(float rad)
	{
		return 3.14f*rad*rad;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter radius of circle:");
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		
		System.out.print("Area of Circle="+Areaofcircle(r));
	}
}
