class T 
{
	static boolean i;
	public static void main(String[] args) 
	{
		int i = 20;
		System.out.println(i);
		System.out.println(T.i);
		i = 40;
		T.i = true;
		System.out.println(i);
		System.out.println(T.i);
	}
}
