import java.util.*;
class PrimeComposite
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array:");
		int s=sc.nextInt();
		int a[]=new int[s];
		int pcount=0,ccount=0;
		System.out.println("enter the elements in array:");
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i =0;i<s;i++)
		{
			int temp=a[i];
			int fact=0;
			for(int j =2;j<temp;j++)
			{
				if(temp%j==0)
				{
					fact=1;
				}
			}
			if(fact==1)
			{
				ccount++;
			}
			else
			{
				pcount++;
			}
		}
		System.out.println("no of compositise numbers:"+ ccount);
		System.out.println("no of prime numbers:"+pcount);
	}
}