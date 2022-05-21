import java.util.Scanner;

public class Factorial
{
	int fact(int n)
    {
        if(n > 1)
        {
            return(n * fact(n - 1));
        }
        return 1;
    }
	
    public static void main(String[] args) 
    {
        int num, ans;
        Scanner s = new Scanner(System.in);
        
        System.out.println("OUTPUT :-");
        
        System.out.print("Enter any integer:");
        num = s.nextInt();
        
        Factorial obj = new Factorial();
        ans = obj.fact(num);
        System.out.println("Factorial of "+num+" = "+ans);
    }
}