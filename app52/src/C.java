class C
{
	public static void main(String[] args) 
	{
		byte i = 20;//i is a byte type
		Byte obj = Byte.valueOf(i);//boxing
		byte j = obj.byteValue();//unboxing
		System.out.println(obj);//obj.toString();
		System.out.println(i);
		System.out.println(j);
	}
}