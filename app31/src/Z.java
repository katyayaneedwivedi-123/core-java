import java.util.Arrays;
class Z
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50};
		System.out.println("Sum of even numbers: ");
		int sum = 0;
		for(int i = 0; i < elements.length;i++)
		{
			if(i % 2 == 0)
			{
				sum+=elements[i];
			}
		}
		System.out.println(sum);
		
	}
}