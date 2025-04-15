class Z23 
{
	public static void main(String[] args) 
	{
		byte i = 10;
		Byte obj1 = Byte.valueOf(i);
		//Integer obj2 = obj1;//this line give error
		System.out.println("done");
	}
}
//one wrapper class can not be converted into another wrapper class
//if we comment line number 7 then it run successfully