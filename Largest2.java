import java.util.Arrays;
import java.util.*;
class Largest2
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("enter size of the array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter elements of array:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("enter n value for minimum:");
		int nth=sc.nextInt();
		System.out.println("enter m value for maximun:");
		int mth=sc.nextInt();
		int min=a[nth-1];	
		int max=a[size-mth];
		int sum=max+min;
		int diff=max-min;
		System.out.println("sum of two numbers:"+sum);
		System.out.println("difference of two numbers:"+diff);
	}
}