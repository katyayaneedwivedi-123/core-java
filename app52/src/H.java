class H
{
	public static void main(String[] args) 
	{
		double i = 20.0;
		Double obj = Double.valueOf(i);//boxing
		double j = obj.doubleValue();//unboxing
		System.out.println(obj);//obj.toString();
		System.out.println(i);
		System.out.println(j);
	}
}