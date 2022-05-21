class Child extends Parent
{
   //Overriding method
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
    
   public static void main( String args[]) 
   {
	   	Child Sq=new Child();
   		Child Rect=new Child();
   		Child Cir=new Child();
      
   		System.out.println("OUTPUT :-");
   		
   		Sq.square(10);
   		Rect.rectangle(10, 20);
   		Cir.circle(4.5);
   }
}