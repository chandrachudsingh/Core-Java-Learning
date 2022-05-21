public class SKIT2 
{
	public static void main(String[] args)
	{
		int count=0,flag=0;
		for(int num=4;;num++)
		{
				for(int i=2;i<=num/2;i++)
				{
					if(num%i==0)
					{
						flag=1;
						break;
					}
				
				}
				if(flag==0)
					count++;
				flag=0;
				if(count==2017)
					System.out.print(num);
				
		}
	}
}
