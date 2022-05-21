
public class RectangleI implements ShapeI
{
	private float l=0,b=0;
	
	public RectangleI(float l, float b) 
	{
		this.l=l;
		this.b=b;
	}
	
	public float area() 
	{
		display();
		return (float)(2*l*b);
	}

	public float perimeter() 
	{
		display();
		return (float)(2*(l+b));
	}
	
	public int no_of_sides() 
	{
		display();
		return 4;
	}
	
	public void display()
	{
		System.out.println("Shape is Rectangle");
	}
}
