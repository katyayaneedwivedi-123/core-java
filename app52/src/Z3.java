class Z3 
{
	public static void main(String[] args) 
	{
		String s1 = "100.45e";
		Double obj = Double.valueOf(s1);
		double i = obj.doubleValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
//number format exception
//b/c only f and d is allow not e allow