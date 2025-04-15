class F
{
	public static void main(String[] args) 
	{
		int i = 1;
		while(i <= 5)
		{
			System.out.println("loop body:" + i);
			if(i == 3)
			{
				System.out.println("if block" + i);
				continue;
			}
				System.out.println("loop body:" + i);
				i++;
		}
			System.out.println("main end:" + i);
	}
}
// b/c of continue it goes to the infinite loop b/c the while loop use to continue it goto infinite time 
// o/p is infinite execution