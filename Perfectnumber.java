class Perfectnumber
{
    public static void main(String arg[])
    {
        int i;
        int n=6;
	int sum=0;
        for(i=1;i<n;i++)
		if(n%i==0){
			sum=sum+i;
			System.out.println(sum);
			}
				if(sum==n){
					System.out.println("perfect number");
					   }
				else{
					System.out.println("not a perfect number");
				     }
				
     }
}