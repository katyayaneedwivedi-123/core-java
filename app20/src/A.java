class A 
{
	public static void main(String[] args) 
	{
		int i;
		for(i = 1, System.out.println("init:" + i);
		test(i);//calling statement of mathod
		System.out.println("before changes:" + i),
		i++,
		System.out.println("after changes:" + i))
		{
			System.out.println("loop body:" + i);
		}
	}
	static boolean test(int i)
	{
		boolean b1 = (i <= 5);
		System.out.println("boolean result for " + i + "is" + b1);
		return b1;
	}// this is a mathod definition from line no 7
}
