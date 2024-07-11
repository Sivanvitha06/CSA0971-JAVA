import java.util.*;
class R192224041{
    public static void main(String arg[]){
        int arr[]={16,20};
        int lcm=arr[0];
        int gcd=arr[0];
        for(int i=1;i<arr.length;i++){
            gcd=findGCD(arr[i],lcm);
            lcm=(lcm*arr[i])/gcd;
        }
       System.out.println("LCM="+lcm);
       System.out.println("GCD="+gcd);
    }
    public static int findGCD(int a,int b){
        if(b==0)
        return a;
        return findGCD(b,a%b);
    }
}