class D
{
	public static void main(String[] args) 
	{
		boolean[] items = {true, false, true, false};
		boolean i;//it not declared 
		for(i : items)
		{
			System.out.println(i);
		}
	}
}//compilation error b/c in the for-each-loop should not be declared the variable