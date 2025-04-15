import java.util.Arrays;
class W
{
	public static void main(String[] args) 
	{
		int[] elements = {1, 20, 3, 40, 5};
		System.out.println("odd");
		for(int i = 0; i < elements.length;i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(elements[i]);
			}
		}
		System.out.println("even");
		for(int i = 0; i < elements.length;i++)
		{
			if(i % 2 == 1)
			{
				System.out.println(elements[i]);
			}
		}
	}
}