import java.util.Arrays;
class T
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50};
		System.out.println("initial content:" + Arrays.toString(elements));
		//swap first element with last element
		int K;//take the variable and assign the index no
		K = elements[0];
		elements[0] = elements[4];
		elements[4] = K;
		System.out.println("final content:" + Arrays.toString(elements));
	}
}
