import java.util.Scanner;

public class Point2D 
{
	protected float x,y;
	
	public Point2D()
	{
		x=y=0;
	}
	
	public Point2D(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public Point2D(Point2D P1)
	{
		this.x=P1.x;
		this.y=P1.y;
	}
	
	public void readPoint()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter x co-ordinate:");
		x=sc.nextInt();
		System.out.println("Enter y co-ordinate:");
		y=sc.nextInt();
	}
	
	public void showPoint()
	{
		System.out.println("Co-ordinates of the Point is : ("+x+","+y+")");
	}
	
	public static void calDist(Point2D P1, Point2D P2)
	{
		float dist=(float)Math.sqrt(Math.pow(P1.x-P2.x, 2)+Math.pow(P1.y-P2.y, 2));
		System.out.println("Distance between two points = "+dist);
	}
}
