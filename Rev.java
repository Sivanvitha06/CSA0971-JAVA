class Rev
{
    public static void main(String arg[])
    {
        int r;
        int n=5678;
        int rev=0;
        int temp=n;
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
    }
}