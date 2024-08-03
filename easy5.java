class easy5
{
	public static void main(String arg[]){
		int n=600000;
		double tax;
		if(n<=250000){
			tax=0;
			System.out.println("tax:"+tax);
		}
		else if(n>=250001 && n<=50000){
			tax=n*0.1;
			System.out.println("tax:"+tax);
		}
		else{
			tax=n*0.2;
			System.out.println("tax:"+tax);
		}
	}
}