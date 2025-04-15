class O1
{
	public static void main(String[] args) 
	{
		String s1 = "abchelloxyz";
		//			 0123456789
		String s2 = s1.substring(2);//if it have only one arg then it take the 2 arg as the length of array
		String s3 = s1.substring(5);
		String s4 = s1.substring(4);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
/*
abchelloxyz
chelloxyz
lloxyz
elloxyz
*/