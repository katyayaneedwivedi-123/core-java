class B 
{
	public static void main(String[] args) 
	{
		final int i = 10;
		System.out.println(i);
		i = 10;
		System.out.println(i);
	}
}
//compilation error
//we can not modify the final variable it give error
//eventhough the same value but we can't reinitialize