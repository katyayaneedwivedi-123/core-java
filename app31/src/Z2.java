import java.util.Arrays;
class Z2
{
	public static void main(String[] args) 
	{
		int[] elements = {1, 20, 3, 40, 5};
		System.out.println("Avg of odd numbers: ");
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < elements.length;i++)
		{
			avg = sum / 5;
			if(i % 2 == 1)
			{
				avg/=elements[i];
			}
		}
		System.out.println(avg);
		
	}
}