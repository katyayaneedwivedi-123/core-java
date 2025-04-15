class F
{
	public static void main(String[] args) 
	{
		float i = 20;
		Float obj = Float.valueOf(i);//boxing
		float j = obj.floatValue();//unboxing
		System.out.println(obj);//obj.toString();
		System.out.println(i);
		System.out.println(j);
	}
}