class H 
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefabcdef";
				   //0123456789
		int i = s1.indexOf(4, 'd');//its a wrong way we are not write the indexing no before the word
		int j = s1.indexOf(8, 'a');
		System.out.println(i);
		System.out.println(j);
	}
}
/*
-1
-1
*/