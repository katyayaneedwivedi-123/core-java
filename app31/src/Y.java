import java.util.Arrays;
class Y
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50};
		int max = elements[4];
		for(int i = 4; i < elements.length;i++)
		{
			if(elements[i] < max)
			{
				max = elements[i];
			}
		}
		System.out.println("max:" +max);
	}
}
