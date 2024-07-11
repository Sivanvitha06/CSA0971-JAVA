class Armstrong
{
    public static void main(String arg[])
    {
        int r;
        int n=153;
        int rev=0;
        int temp=n;
        while(n!=0)
        {
            r=n%10;
            rev=rev+r*r*r;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("not a Armstrong");
        }
    }
}