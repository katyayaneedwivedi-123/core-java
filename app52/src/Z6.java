class Z6 
{
	public static void main(String[] args) 
	{
		String s1 = "12345";
		Boolean obj = Boolean.valueOf(s1);
		boolean i = obj.booleanValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
/*
12345
false
false
*/