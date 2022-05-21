import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		 int n1=0, n2=1, n3;  
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the length of the fibonacci series :");
		 int count = sc.nextInt();
		 
		 if(count >= 1)
			 System.out.print(n1+" ");    //printing 0
		 if(count >= 2)
			 System.out.print(n2);    //printing 1    

		    
		 for(int i=2; i<count; i++)		//loop starts from 2 because 0 and 1 are already printed    
		 {    
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
		 } 
	}
}
