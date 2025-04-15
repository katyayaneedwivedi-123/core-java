class Z24 
{
	public static void main(String[] args) 
	{
		byte i = 10;
		Byte obj1 = Byte.valueOf(i);
		//Integer obj2 = obj1;//this line give error
		Number obj2 = obj1;
		Number obj3 = obj1;
		System.out.println("done");
	}
}