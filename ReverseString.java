import java.util.*;
class ReverseString
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a word:");
		String input=sc.nextLine();
		int n= input.length();
		System.out.println("reverse of string:");
		for(int i=n-1;i>=0;i--)
		{
			char c = input.charAt(i);
			System.out.print(c);
		}
	}
}