class P1
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50};	//	declaration & definition & initialization
		System.out.print("initial content:");
		for(int i = 0; i < elements.length;i++)
		{
			System.out.print(elements[i] + ", ");
		}
		System.out.println();
		for(int i = 0; i < elements.length;i++)
		{
			elements[i] = elements[i] + 5;//replace the value in 5 value
		}
		System.out.print("final content:");
		for(int i = 0; i < elements.length;i++)
		{
			System.out.print(elements[i] + ", ");
		}
		System.out.println();
	}
}