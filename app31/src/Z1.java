import java.util.Arrays;
class Z1
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50};
		System.out.println("Sum of odd numbers: ");
		int sum = 0;
		for(int i = 0; i < elements.length;i++)
		{
			if(i % 2 == 1)
			{
				sum+=elements[i];
			}
		}
		System.out.println(sum);
		
	}
}