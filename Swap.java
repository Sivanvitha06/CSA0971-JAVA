class Swap
{
	public static void main(String arg[])
	{
		int a,b;
		a=10;
		b=20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after Swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}