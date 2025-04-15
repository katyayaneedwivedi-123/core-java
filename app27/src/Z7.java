class Z7 
{
	static int i = test();//i is a int type and retrun is string so it error
	static String test()//String can not be converted into int type
	{
		return "abc";
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
//variable data type and return type should be same 