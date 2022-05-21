
public class SKIT 
{
	public static void main(String[] args)
	{
		int a,b,c,count=0;
		for(c=0;c<242280;c++)
		{
			for(b=0;b<c;b++)
			{
				for(a=0;a<b;a++)
				{
					
				if(c*c==b*b+a*a)
				{
					count++;
				}
				}
			}
			
			
		}
		System.out.print(count);
	}
}
