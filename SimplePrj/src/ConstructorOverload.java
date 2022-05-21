public class ConstructorOverload
{
    public ConstructorOverload(float x)
    {
        System.out.println("area of the square = "+Math.pow(x, 2)+" sq units");
    }
    public ConstructorOverload(float l, float b)
    {
        System.out.println("area of the rectangle = "+(l*b)+" sq units");
    }
    public ConstructorOverload(double r)
    {
        System.out.println("area of the circle = "+(Math.PI*r*r)+" sq units");
    }
    
    public static void main(String[] args)
    {
    	System.out.println("OUTPUT :-");
    	
    	ConstructorOverload Square=new ConstructorOverload(10);
    	ConstructorOverload Rectangle=new ConstructorOverload(10,20);
    	ConstructorOverload Circle=new ConstructorOverload(3.4);
    }
}
