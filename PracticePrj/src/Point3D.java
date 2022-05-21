import java.util.Scanner;

public class Point3D extends Point2D
{
	private float z;
	
	public Point3D()
	{
		super();
		z=0;
	}
	
	public Point3D(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
	}
	
	public Point3D(Point3D P1)
	{
		super(P1);
		this.z=P1.z;
	}
	
	public void readPoint()
	{
		super.readPoint();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter z co-ordinate:");
		z=sc.nextInt();
	}
	
	public void showPoint()
	{
		System.out.println("Co-ordinates of the Point is : ("+x+","+y+","+z+")");
	}
	
	public static void calDist(Point3D P1, Point3D P2)
	{
		float dist=(float)Math.sqrt(Math.pow(P1.x-P2.x, 2)+Math.pow(P1.y-P2.y, 2)+Math.pow(P1.z-P2.z, 2));
		System.out.println("Distance between two points = "+dist);
	}
}
