import java.util.Scanner;

public class DemoSplitArmstrong 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
	
		int arr[]=new int[n];
		System.out.println("Enter "+arr.length+" elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int countArm=0;
		boolean status[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int count=0,sum=0;
			for(int x=arr[i];x>0;x/=10)
				count++;
			for(int x=arr[i];x>0;x/=10)
				sum+=Math.pow(x%10, count);
		    
			if(sum==arr[i])
			{	
				status[i]=true;
				countArm++;
			}
		}
		
		int Arm[]=new int[countArm];
		int NoArm[]=new int[arr.length-Arm.length];
		int j=0,k=0;
		for(int i=0;i<arr.length;i++)
		{
			if (status[i]==true)
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
		System.out.println("Armstrong array elements are:");
		for(int i=0;i<Arm.length;i++)
			System.out.println(Arm[i]);
		System.out.println("Non-Armstrong array elements are:");
		for(int i=0;i<NoArm.length;i++)
			System.out.println(NoArm[i]);
	}
}
