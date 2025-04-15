class Q 
{
	public static void main(String[] args) 
	{
		String s1 = "100";
		Float obj = Float.valueOf(s1);
		float i = obj.floatValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
/*
100
100.0
100.0
*/