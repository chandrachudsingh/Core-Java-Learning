import java.util.Scanner;

public class Rectangle extends Shape 
{
	private float l=0,b=0;

	Rectangle(float l, float b) 
	{
		super("Rectangle");
		this.l=l;
		this.b=b;
	}
	
	float area() 
	{
		display();
		return (float)(2*l*b);
	}

	float perimeter() 
	{
		display();
		return (float)(2*(l+b));
	}
	
	int no_of_sides() 
	{
		display();
		return 4;
	}
}
