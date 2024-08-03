import java.util.*;
class easy2{
	public static void main(String arg[]){
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
  		a=sc.nextInt();
		int temp=a;
		int rev=0;
		int r;
		while(a!=0){
			r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		if (temp==rev){
			System.out.println("number is a palindrome");
		}
		else{
			System.out.println("number is not palindrome");
		}

	}
}