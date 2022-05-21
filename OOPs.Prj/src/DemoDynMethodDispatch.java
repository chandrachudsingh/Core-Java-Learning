
public class DemoDynMethodDispatch 
{
	public static void main(String[] args)
	{
		Base Bref=new Derived();
		Bref.display();
		Bref.welcome();
	}
}
