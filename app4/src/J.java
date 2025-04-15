class J 
{
	public static void main(String[] args) 
	{
		int p = 10;
		System.out.println(p);
		System.out.println(p);
		System.out.println(p = 30);	//	change b/c inner statement is 30 but outer is 10 so it change in 30 
		System.out.println(p);	//	change
		System.out.println(p = 50);	//	rechange b/c inner statement is 50 but outer is 30 so it change in 50 
		System.out.println(p);	//	rechange
	}
}
