class O
{
	public static void main(String[] args) 
	{
		String s1 = "abchelloxyz";
		//			 0123456789
		String s2 = s1.substring(2, 9);
		String s3 = s1.substring(5, 10);
		String s4 = s1.substring(4, 7);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
/*
abchelloxyz
chellox
lloxy
ell
*/