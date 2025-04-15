class K 
{
	public static void main(String[] args) 
	{
		String s1 = "100";
		Integer obj = Integer.valueOf(s1);//another overloaded method
		int i = obj.intValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
//it taking content only string object but it give the o/p in int value
/*
100
100
100
*/