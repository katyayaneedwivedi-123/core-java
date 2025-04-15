class L 
{
	public static void main(String[] args) 
	{
		String s1 = true ? "abc" : "xyz";
		String s2 = false ? "abc" : "xyz";
		System.out.println(s1);//abc
		System.out.println(s2);//xyz
	}
}
