class O 
{
	public static void main(String[] args) 
	{
		String s1 = "100";
		Short obj = Short.valueOf(s1);
		short i = obj.shortValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
