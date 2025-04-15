class M 
{
	public static void main(String[] args) 
	{
		String s1 = "100.0";
		Integer obj = Integer.valueOf(s1);
		int i = obj.intValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
//number format exception b/c including . no special character allow