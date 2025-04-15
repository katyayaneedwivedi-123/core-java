class Z8 
{
	public static void main(String[] args) 
	{
		String s1 = "100";
		byte i = Byte.parseByte(s1);
		short j = Short.parseShort(s1);
		int k = Integer.parseInt(s1);
		long m = Long.parseLong(s1);
		float n = Float.parseFloat(s1);
		double p = Double.parseDouble(s1);
		boolean q = Boolean.parseBoolean(s1);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		System.out.println(n);
		System.out.println(p);
		System.out.println(q);
	}
}
/*
100
100
100
100
100.0
100.0
false
*/
//in wrapper class use of parse method we can convert directly in 
//any data type only char is not converted