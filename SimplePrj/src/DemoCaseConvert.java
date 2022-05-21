import java.util.Scanner;

public class DemoCaseConvert 
{
     public static void main(String[] args)
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter an character:");
    	 
    	 char ch=sc.next().charAt(0);
    	 
    	 if(ch>=65&&ch<=90)
    		 System.out.print("lower case of the charater is "+(char)(ch+32));
    	 else if(ch>=97&&ch<=122)
    		 System.out.print("upper case of the charater is "+(char)(ch-32));
    	 else
    		 System.out.print("It is not a charater");
     }
}
