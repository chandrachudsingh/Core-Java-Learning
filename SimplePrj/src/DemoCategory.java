import java.util.Scanner;

public class DemoCategory 
{ 
	public static void main(String[] args)
	{
	      Scanner sc=new Scanner(System.in);
          System.out.println("Enter an character:");
          
          char ch=sc.next().charAt(0);
          
          if(ch>='0'&&ch<='9')
              System.out.print("It's a number");
          else if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
        	  System.out.print("It's a letter");
          else
        	  System.out.print("It's a special character");
	}
}
