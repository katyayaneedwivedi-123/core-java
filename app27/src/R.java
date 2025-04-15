class R
{
	static int i = 20;
	public static void main(String[] args) 
	{
		System.out.println(i);
		i = 40;
		System.out.println(i);
		int i = 60;
		System.out.println(i);
		System.out.println(R.i);
	}
}