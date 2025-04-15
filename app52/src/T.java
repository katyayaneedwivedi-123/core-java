class T 
{
	public static void main(String[] args) 
	{
		String s1 = "100F";
		Float obj = Float.valueOf(s1);
		float i = obj.floatValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
//it run successful