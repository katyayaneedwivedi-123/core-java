import java.util.Arrays;
class V
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50};
		System.out.println("initial content:" + Arrays.toString(elements));
		int sum = 0;
		for(int i = 0; i < elements.length;i++)
		{
			sum = sum + elements[i];
		}
		int avg = 0;
		for(int i = 0; i < elements.length;i++)
		{
			avg = sum / 5;
		}
		System.out.print(avg);
	}
}