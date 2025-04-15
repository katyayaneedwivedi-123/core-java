package set1;

public class Q27 {
	public static void main(String[] args) {
		int[] elements = {57, 20, 30, 44, 50, 27, 70, 88, 77};
		for (int i = elements.length - 1; i >= 0 ; i -= 2) {
			System.out.println(elements[i] + ", ");
		}
		System.out.println();
		System.out.println("done");
	}
}
//Read alternative elements in the reverse order