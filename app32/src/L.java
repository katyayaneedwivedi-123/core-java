class L
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefabcdef";
		//			 0123456789
		int i = s1.lastIndexOf("cde");//search left to right
		int j = s1.lastIndexOf("dem");//search left to right
		System.out.println(i);
		System.out.println(j);
		int k = s1.lastIndexOf("abc", 4);//search left to right
		int m = s1.lastIndexOf("fabc", 4);//search left to right
		System.out.println(k);
		System.out.println(m);
	}
}
/*
8
-1
0
-1
*/