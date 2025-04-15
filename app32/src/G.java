class G 
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefabcdef";
		int i = s1.indexOf('d');
		int j = s1.indexOf('m');//any value are not available then it give the -1
		System.out.println(i);
		System.out.println(j);
	}
}
/*
3
-1
*/