class U 
{
	public static void main(String[] args) 
	{
		String s1 = "100q";
		Float obj = Float.valueOf(s1);
		float i = obj.floatValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
//only f and F is allow and other alphabet is not allow
// it give number format exception