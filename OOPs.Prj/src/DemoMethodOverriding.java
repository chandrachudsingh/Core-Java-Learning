
public class DemoMethodOverriding 
{
	public static void main(String[] args)
	{
		Base B=new Base();
		B.display();
		B.welcome();
		
		Derived D=new Derived();
		D.display();
		D.welcome();
		D.show();
	}
}
