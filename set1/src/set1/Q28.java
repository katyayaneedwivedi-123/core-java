package set1;

public class Q28 {
	public static void main(String[] args) {
		int[] elements = {57, 20, 30, 44, 50, 27, 70, 88, 77};
		
		int sum = 0;
		for (int i = 0; i < elements.length; i++) {
			sum += elements[i];
		}
		System.out.println(sum);
		System.out.println("done");
	}
}
//Find the sum of all given elements from an int array