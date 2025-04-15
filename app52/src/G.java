class G
{
	public static void main(String[] args) 
	{
		//float i = 20.0;//we not give this type value b/c this value is double 
		float i = 20.0f;//it is expicit norrowing so we give the f in value if we not give this then it give error
		Float obj = Float.valueOf(i);//boxing
		float j = obj.floatValue();//unboxing
		System.out.println(obj);//obj.toString();
		System.out.println(i);
		System.out.println(j);
	}
}