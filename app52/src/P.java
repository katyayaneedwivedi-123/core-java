class P 
{
	public static void main(String[] args) 
	{
		String s1 = "100";
		Long obj = Long.valueOf(s1);
		long i = obj.longValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
