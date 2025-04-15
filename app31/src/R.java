import java.util.Arrays;
class R
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50};
		System.out.println("initial content:" + Arrays.toString(elements));
		//increment first elements with one unit
		//decrement last elements with 12 units
		elements[0] = elements[0] + 1;
		//elements[0]++;
		elements[elements.length - 1] = elements[elements.length - 1] - 12;
		System.out.println("final content:" + Arrays.toString(elements));
	}
}
