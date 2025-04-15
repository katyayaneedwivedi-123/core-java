class E
{
	public static void main(String[] args) 
	{
		long i = 20;
		Long obj = Long.valueOf(i);//boxing
		long j = obj.longValue();//unboxing
		System.out.println(obj);//obj.toString();
		System.out.println(i);
		System.out.println(j);
	}
}