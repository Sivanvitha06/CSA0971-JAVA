class Composite
{
    public static void main(String arg[])
    {
        int n, i;
        n=5;
	int count=0;
        for(i=2;i<n;i++)
		if(n%i==0){
			count++;			}
			if(count==0){
				System.out.println("Prime number");
				    }
			else{
				System.out.println("Composite number");
			    }
     }
}