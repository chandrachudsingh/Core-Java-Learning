import java.util.Scanner;

public class SplitArmNoArm 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		
		System.out.println("Enter array elements:");
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int x=0,countArm=0;
		boolean [] status=new boolean[n];
		for(int i=0;i<status.length;i++)
		{
			int count=0;
			for(x=arr[i];x>0;x/=10,count++);
				
			int sum=0;
			for(x=arr[i];x>0;x/=10)
				sum+=Math.pow(x%10, count);
			if(sum==arr[i])
				countArm++;
			
			if(sum==arr[i])
				status[i]=true;
		}
		
		int [] Arm=new int[countArm];
		int [] NoArm=new int[n-countArm];
		
		int j=0,k=0;
		for(int i=0;i<status.length;i++)
		{
			if(status[i]==true)
			{
				Arm[j]=arr[i];
				j++;
			}
			else
			{
				NoArm[k]=arr[i];
				k++;
			}
		}
		System.out.println("Armstrong no. array elements are:");
		for(int i=0;i<Arm.length;i++)
			System.out.println(Arm[i]+"\t");
		
		System.out.println("NoArmstrong no. array elements are:");
		for(int i=0;i<NoArm.length;i++)
			System.out.println(NoArm[i]+"\t");
	}
}
