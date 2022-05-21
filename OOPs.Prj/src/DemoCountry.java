
public class DemoCountry 
{
	public static void main(String[] args)
	{
		District D1=new District();	
		D1.readData();
		D1.showData();
		
		District D2=new District(D1);
		D2.showData();
		
		District D3=new District("India","Delhi","Narendra Modi","Rajasthan","Jaipur","Ashok gehlot","Bikaner","pta nhi");
		D3.showData();
	}
}
