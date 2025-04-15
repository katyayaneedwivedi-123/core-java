class P1
{
	public static void main(String[] args) 
	{
		int i = 1;
		while(i <= 5)
		{
			System.out.println("loop body:" + i);
			i++;
		}
		System.out.println("main end:" + i + "," + j);
	}
}
// compile time error b/c local member can not used outside