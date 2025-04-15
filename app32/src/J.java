class J
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefabcdef";
		//			 0123456789
		int i = s1.lastIndexOf('d');//search left to right
		int j = s1.lastIndexOf('a');//search left to right
		System.out.println(i);
		System.out.println(j);
		int k = s1.lastIndexOf('d', 2);//search left to right
		int m = s1.lastIndexOf('c', 3);//search left to right
		System.out.println(k);
		System.out.println(m);
	}
}
/*
9
6
-1
2
*/