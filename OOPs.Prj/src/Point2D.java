import java.util.Scanner;

public class Point2D 
{
	protected float x,y;
	
	public Point2D()
	{
		x=y=0;
	}
	public Point2D(Point2D P1) 
	{
		this.x=P1.x;
		this.y=P1.y;
	}
	public Point2D(int x, int y) 
	{
		this.x=x;
		this.y=y;
	}
	void readPoint()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter x-coordinate:");
		x=sc.nextFloat();
		System.out.println("Enter y-coordinate:");
		y=sc.nextFloat();
	}
	void showPoint()
	{
		System.out.println("Coordinates of the Point is:("+x+","+y+")");
	}
	public static void calDistance(Point2D P1, Point2D P2) 
	{
		float dist=(float)Math.sqrt(Math.pow(P2.x-P1.x,2)+Math.pow(P2.y-P1.y,2));
		System.out.print("Distance between the points="+dist);
	}
}

