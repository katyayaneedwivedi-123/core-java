class Z22
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = test();
		System.out.println("main end:" + i);
	}
	public static char test() 
	{
		System.out.println("test");//int can not convert in char
		int j = 48;
		return j;
	}
}
//compilation error