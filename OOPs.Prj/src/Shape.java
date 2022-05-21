
public abstract class Shape 
{
	String name;
	
	Shape(String name)
	{
		this.name=name;
	}
	
	abstract float area();
	abstract float perimeter();
	abstract int no_of_sides();
	
	final float pie=3.14f;
	
	void display()
	{
		System.out.println("Shape is "+name);
	}
}
