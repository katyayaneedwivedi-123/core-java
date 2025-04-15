class Z5 
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		Boolean obj = Boolean.valueOf(s1);
		boolean i = obj.booleanValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
//in boolean if we give other than true then it give false not 
//any exception
/*
abc
false
false
*/