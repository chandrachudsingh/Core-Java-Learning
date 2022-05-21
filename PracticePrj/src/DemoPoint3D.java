
public class DemoPoint3D 
{
	public static void main(String[] args)
	{
		Point3D P1=new Point3D();
		P1.readPoint();
		P1.showPoint();
		
		Point3D P2=new Point3D();
		P2.readPoint();
		P2.showPoint();
		
		Point3D P3=new Point3D(5,5,5);
		P3.showPoint();
		
		Point3D P4=new Point3D(P1);
		P4.showPoint();
		
		Point3D.calDist(P1, P2);
	}
}
