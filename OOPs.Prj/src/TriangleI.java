
public class TriangleI implements ShapeI
{
	private float b=0, h=0;
	
	public TriangleI(float b, float h) 
	{
		this.b=b;
		this.h=h;
	}
	
	public float area() 
	{
		display();
		return (float)((1/2)*b*h);
	}

	public float perimeter() 
	{
		display();
		return (float)(2*Math.sqrt(((Math.pow(b, 2)/4))+Math.pow(h, 2)));
	}
	
	public int no_of_sides() 
	{
		display();
		return 3;
	}
	
	public void display()
	{
		System.out.println("Shape is Triangle");
	}
}
