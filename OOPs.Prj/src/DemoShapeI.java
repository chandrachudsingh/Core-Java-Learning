import java.util.Scanner;

public class DemoShapeI 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle:");
		float r=sc.nextFloat();
		
		ShapeI C1=new CircleI(r);
		float ar=C1.area();
		System.out.println("Area of circle="+ar);
		
		float no=C1.no_of_sides();
		System.out.println("Number of sides of circle="+no);
		
		float per=C1.perimeter();
		System.out.println("Perimeter of Circle="+per);
		
		System.out.println("Enter Length and Breadth of the Rectangle:");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		
		ShapeI R1=new RectangleI(l, b);
		ar=R1.area();
		System.out.println("Area of Rectangle="+ar);
		
		no=R1.no_of_sides();
		System.out.println("Number of sides of Rectangle="+no);
		
		per=R1.perimeter();
		System.out.println("Perimeter of Rectangle="+per);
		
		System.out.println("Enter base and height of the Rectangle:");
		float bs=sc.nextFloat();
		float h=sc.nextFloat();
		
		ShapeI T1=new TriangleI(bs, h);
		ar=T1.area();
		System.out.println("Area of Triangle="+ar);
		
		no=T1.no_of_sides();
		System.out.println("Number of sides of Triangle="+no);
		
		per=T1.perimeter();
		System.out.println("Perimeter of Triangle="+per); 
	}
}
