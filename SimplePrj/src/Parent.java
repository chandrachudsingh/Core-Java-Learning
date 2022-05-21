public class Parent
{
   //Overridden method
	public void square(float x)
    {
        System.out.println("area of the square = "+Math.pow(x, 2)+" sq units");
    }
    public void rectangle(float l, float b)
    {
        System.out.println("area of the rectangle = "+(l*b)+" sq units");
    }
    public void circle(double r)
    {
        System.out.println("area of the circle = "+(Math.PI*r*r)+" sq units");
    }
}

