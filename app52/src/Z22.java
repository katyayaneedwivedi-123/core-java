class Z22 
{
	public static void main(String[] args) 
	{
		double a = 3.4;
		Double obj = Double.valueOf(a);
		int b = obj.intValue();
		double c = obj.doubleValue();
		byte d = obj.byteValue();
		short e = obj.shortValue();
		long f = obj.longValue();
		float g = obj.floatValue();
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
