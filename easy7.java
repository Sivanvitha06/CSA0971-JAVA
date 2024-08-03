class easy7

 {
    public static void main(String arg[]) 
{ 
        int a=0;
	int b=1;
	int c;
	System.out.println("Fibonacci series:");
        for (int i = 1; i <= 5; i++)
	{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
        }
    }
}
