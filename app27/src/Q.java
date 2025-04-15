class Q 
{
	static int i = 20;
	public static void main(String[] args) 
	{
		System.out.println(i);
		i = 40;
		System.out.println(i);
		int i = 60;
		System.out.println(i);// local and global is visible 
	}
}
/*
20
40
60
*/