class Factorscount
{
	public static void main(String arg[])
	{
		int n, k;
		n=100;
		k=4;
		int count=0;
		int kthfactor=-1;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
				if(k==count)
				{
					kthfactor=i;
				}
			}
		}
		if(kthfactor!=-1)
		{
			System.out.println("no of factors:"+count+ " kth factor is:"+kthfactor);
		}
	}
}