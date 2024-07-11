import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
	System.out.println("enter no.of elements in the first array:");
        int n1=input.nextInt();
        int[] a1=new int[n1];
	System.out.println("enter the numbers in the first array:");
        for(int i=0;i<n1;i++)
        {
            a1[i]=input.nextInt();
        }
        System.out.print("enter no of elements in the second array:");
        int n2=input.nextInt();
        int[] a2=new int[n2];
	System.out.println("enter the numbers in the second array:");
        for(int i=0;i<n2;i++)
        {
            a2[i]=input.nextInt();
        }
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(a1[i]==a2[j])
                {
                    System.out.print(a1[i]+" ");
                    break;
                }
            }
        }
    }

}