class Z10
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		boolean b1 = test();
		System.out.println("main:" + b1); 
	}
	public static boolean test() 
	{
		System.out.println("test");
		return false;
	}
}
/*main
test
main:false 
*/