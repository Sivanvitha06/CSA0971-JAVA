class Pyramid
{
	public static void main(String arg[])
	{
		int n=4,i,j,k;
		for(i=1;i<=n; i++)
		{
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}