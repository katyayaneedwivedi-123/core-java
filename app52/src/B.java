class B
{
	public static void main(String[] args) 
	{
		int i = 20;//i is a int type
		Integer obj = Integer.valueOf(i);//boxing
		int j = obj.intValue();//unboxing
		System.out.println(obj);//obj.toString();
		System.out.println(i);
		System.out.println(j);
	}
}