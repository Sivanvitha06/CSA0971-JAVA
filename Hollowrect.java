class Hollowrect
{
	public static void main(String arg[])
	{
		int i, j, k, n;
		n=6;
		int m=4;
		for(i=1;i<=m;i++)
		{
			for(j=1;j<=6;j++)
			{
				if(i==1 || j==1 || i==m || j==n)
				{
					System.out.print("*"+"");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}