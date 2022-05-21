
public class CircleI implements ShapeI
{
	private float r=0;
	
	public CircleI(float r) 
	{
		this.r=r;
	}
	
	public float area() 
	{
		display();
		return (float)(ShapeI.pie*r*r);
	}

	public float perimeter() 
	{
		display();
		return (float)(2*pie*r);
	}
	
	public int no_of_sides() 
	{
		display();
		return 0;
	}
	
	public void display()
	{
		System.out.println("Shape is circle");
	}
}
