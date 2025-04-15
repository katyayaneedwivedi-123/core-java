class N 
{
	public static void main(String[] args) 
	{
		String s1 = "100";
		Byte obj = Byte.valueOf(s1);
		byte i = obj.byteValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
/*
100
100
100
*/
//in byte only its range values is allow