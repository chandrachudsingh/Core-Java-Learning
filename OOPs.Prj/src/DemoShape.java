
public class DemoShape
{
	public static void main(String[] args)
	{
		Shape C1=new Circle(4.5f);
		float ar=C1.area();
		System.out.println("Area of circle="+ar);
		
		float no=C1.no_of_sides();
		System.out.println("Number of sides of circle="+no);
		
		int per=(int) C1.perimeter();
		System.out.println("Perimeter of Circle"+per);
		
		Shape R1=new Rectangle(4.5f, 5.5f);
		ar=R1.area();
		System.out.println("Area of Rectangle="+ar);
		
		no=R1.no_of_sides();
		System.out.println("Number of sides of Rectangle="+no);
		
		per=(int) R1.perimeter();
		System.out.println("Perimeter of Rectangle"+per);
		
		Shape T1=new Triangle(4.5f, 5.5f);
		ar=T1.area();
		System.out.println("Area of Triangle="+ar);
		
		no=T1.no_of_sides();
		System.out.println("Number of sides of Triangle="+no);
		
		per=(int) T1.perimeter();
		System.out.println("Perimeter of Triangle"+per);
	}
}
