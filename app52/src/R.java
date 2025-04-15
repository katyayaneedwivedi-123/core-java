class R 
{
	public static void main(String[] args) 
	{
		String s1 = "100.0";
		Float obj = Float.valueOf(s1);
		float i = obj.floatValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
// eventhough it containing a .(dot) it compile successfully b/c of it is a float and double it allow