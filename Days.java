import java.util.*;
class Days{
	public static void main(String arg[]){
		float n;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a no.of days:");
		n=sc.nextFloat();
		float r=n/365;
		System.out.println("no.of years:"+r);
		float remaining_days=n%365;
		float no_of_weeks=(remaining_days/7);
		System.out.println("no.of weeks:"+no_of_weeks);
		float no_of_days=(remaining_days%7);
		System.out.println("no.of days:"+no_of_days);
	}
}