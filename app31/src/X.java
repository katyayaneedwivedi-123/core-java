import java.util.Arrays;
class X
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50};
		int min = elements[0];
		for(int i = 0; i < elements.length;i++)
		{
			if(elements[i] < min)
			{
				min = elements[i];
			}
		}
		System.out.println("min:" + min);
	}
}
