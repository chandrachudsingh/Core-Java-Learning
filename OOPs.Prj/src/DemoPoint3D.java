
public class DemoPoint3D 
{
	public static void main(String[] args)
	{
		Point3D P1=new Point3D();	
		P1.readPoint();
		P1.showPoint();
		
		Point3D P2=new Point3D(P1);
		P2.readPoint();
		P2.showPoint();
		
		Point3D P3=new Point3D(2,2,2);
		P3.showPoint();
		
		Point3D.calDistance(P1,P2);
	}
}
