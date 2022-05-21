
public class DemoPoint2D 
{
	public static void main(String[] args)
	{
		Point2D P1=new Point2D();	
		P1.readPoint();
		P1.showPoint();
		
		Point2D P2=new Point2D(P1);
		P1.readPoint();
		P2.showPoint();
		
		Point2D P3=new Point2D(3,3);
		P3.showPoint();
		
		Point2D.calDistance(P1,P2);
	}
}
