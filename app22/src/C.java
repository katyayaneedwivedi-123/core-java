class C
{
	public static void main(String[] args) 
	{
		int i = 1;
		while(i++ <= 5)
		{
			System.out.println("loop body:" + i);
		}
			System.out.println("main end:" + i);
	}
}
/*
loop body:2
loop body:3
loop body:4
loop body:5
loop body:6
main end:7
*/