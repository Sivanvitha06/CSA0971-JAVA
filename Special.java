import java.util.*;
class Special{
    public static void main(String arg[])
	{
	Scanner input=new Scanner(System.in);
	String s=input.nextLine();
	int len=s.length();
	char a[]=new char[len];
	int sp=0;
	for(int i=0;i<len;i++){
		a[i]=s.charAt(i);
		if(a[i]>=65 && a[i]<=90 ||a[i]>=97 &&a[i]<=122|| a[i]>=48 && a[i]<=57)
		{
		}
		else
		{
		sp++;
		System.out.print(a[i]);
		}
		}
	        System.out.println("\n"+sp);
	}
}