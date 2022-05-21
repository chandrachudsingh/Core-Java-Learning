public class Triangle extends Shape 
{
	private float b=0, h=0;

	Triangle(float b, float h) 
	{
		super("Triangle");
		this.b=b;
		this.h=h;
	}
	
	float area() 
	{
		display();
		return (float)((1/2)*b*h);
	}

	float perimeter() 
	{
		display();
		return (float)(2*Math.sqrt(((Math.pow(b, 2)/4))+Math.pow(h, 2)));
	}
	
	int no_of_sides() 
	{
		display();
		return 3;
	}
}