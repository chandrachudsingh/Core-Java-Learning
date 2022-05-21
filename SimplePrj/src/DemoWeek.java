import java.util.Scanner;

public class DemoWeek 
{
	public static void main(String[] args)
	{
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Ente day of week:");
	      int num=sc.nextInt();
	      
	      switch(num)
	      {
	      case 1:
	           System.out.print("Sunday");
	           break;
	      case 2:
	    	   System.out.print("Monday");
	           break;
	      case 3:
	    	   System.out.print("Tueday");
	           break;
	      case 4:
	    	   System.out.print("Wednesday");
	           break;
	      case 5:
	    	   System.out.print("Thursday");
	           break;
	      case 6:
	    	   System.out.print("Friday");
	           break;
	      case 7:
	    	   System.out.print("Saturday");
	           break;
	      default:
	    	   System.out.print("Enter correct day number");
	      }
	}
}
