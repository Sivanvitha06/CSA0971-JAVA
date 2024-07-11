class Vote
{
	public static void main(String arg[])
	{
		int age;
		age=10;
		if(age>=18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			System.out.println("not eligible for voting,you can vote after"+(age-18)+"years");
		}
		
	}
}