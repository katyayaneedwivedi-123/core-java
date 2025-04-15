class M 
{
	static int i;
	
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(M.i);
		i = 500;
		System.out.println(i);
		System.out.println(M.i);
	}
}
/*
0
0
500
500
*/
// i is static for this code 