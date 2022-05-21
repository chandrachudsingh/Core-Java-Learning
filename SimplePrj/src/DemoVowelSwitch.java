import java.util.Scanner;


public class DemoVowelSwitch 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Alphabet:");
	
		char ch=sc.next().charAt(0);
		
		if(Character.isLetter(ch))
		{
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.print("It is a vowel");
				break;
			default:
				System.out.print("It is a consonant");
			}
		}
		else
			System.out.print("It is not an alphabet");		
	}
}
