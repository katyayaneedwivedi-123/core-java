class P
{
	static int i = test();//i is 0 b/c of order
	static int j = 20;
	
	static int test()
	{
		return j;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
/*
0
20
*/