class P2 
{
	public static void main(String[] args) 
	{
		int[] elements = {23, 54, 56, 80};
		System.out.println("initial content:");
		for(int i = 0; i < elements.length;i++)
		{
			System.out.print(elements[i] + ", ");
		}
		System.out.println();
		for(int i = 0; i < elements.length;i++)
		{
			elements[i] = elements[i] + 5;
		}
		System.out.println("final content:");
		for(int i = 0; i < elements.length;i++)
		{
			System.out.print(elements[i] + ", ");
		}
		System.out.println();
	}
}
