class X 
{
	public static void main(String[] args) 
	{
		String s1 = "100.45d";
		Double obj = Double.valueOf(s1);
		double i = obj.doubleValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
/*
100.45d
100.45
100.45
*/