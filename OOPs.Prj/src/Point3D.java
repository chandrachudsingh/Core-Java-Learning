import java.util.Scanner;

public class Point3D extends Point2D 
{
	private float z;
	
	public Point3D()
	{
		z=0;
	}
	public Point3D(Point3D P1) 
	{
		super(P1);
		this.z=P1.z;
	}
	public Point3D(int x, int y, int z) 
	{
		super(x,y);
		this.z=z;
	}
	void readPoint()
	{
		super.readPoint();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter z-coordinate:");
		z=sc.nextFloat();
	}
	void showPoint()
	{
		System.out.println("Coordinates of the Point is:("+x+","+y+","+z+")");
	}
	public static void calDistance(Point3D P1, Point3D P2) 
	{
		float dist=(float) Math.sqrt(Math.pow(P2.x-P1.x,2)+Math.pow(P2.y-P1.y,2)+Math.pow(P2.z-P1.z,2));
		System.out.print("Distance between the points="+dist);
	}
}

