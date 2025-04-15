class W 
{
	public static void main(String[] args) 
	{
		String s1 = "100.45";
		Double obj = Double.valueOf(s1);
		double i = obj.doubleValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
//in case of double . is allow
//it run successfully