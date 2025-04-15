class C
{
	public static void main(String[] args) 
	{
		boolean[] items = {true, false, true, false};
		for(String i	: items)//varialbe and container type should be same
		{
			System.out.println(i);
		}
	}
}
// not the same type so it give the compilation time error