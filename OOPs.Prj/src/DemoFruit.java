
public class DemoFruit 
{
	public static void main(String[] args)
	{
		/*Fruit M1=new Mango();
		M1.taste();
		M1.season();
		M1.colour();
		
		Fruit O1=new Orange();
		O1.taste();
		O1.season();
		O1.colour();
		
		Fruit A1=new Apple();
		A1.taste();
		A1.season();
		A1.colour(); */
		
		//for single object declaration 
		/*Fruit[] F=new Fruit[3];
		 for(int i=0;i<F.length;i++)
		 	F[i]=new Mango();	*/
		
		Fruit[] F= new Fruit[3];
		
		F[0]=new Mango();
		F[1]=new Orange();
		F[2]=new Apple();
		
		for(int i=0; i<F.length; i++)
		{
			F[i].taste();
			F[i].season();
			F[i].colour();
		}
		
	}
}
