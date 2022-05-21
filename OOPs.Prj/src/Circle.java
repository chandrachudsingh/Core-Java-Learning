import java.util.Scanner;

public class Circle extends Shape 
{
	private float r=0;

	Circle(float r) 
	{
		super("Circle");
		this.r=r;
	}
	
	float area() 
	{
		display();
		return (float)(pie*r*r);
	}

	float perimeter() 
	{
		display();
		return (float)(2*pie*r);
	}
	
	int no_of_sides() 
	{
		display();
		return 0;
	}
}
