package set1;

public class Q7 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 40, 50, 100, 70, 88, 200};
						//	0, 1,  2,  3,  4,  5,  6,  7,  8
						//	length = 9
		for(int i = 0; i < (elements.length / 2); i++) {
			System.out.print(elements[i] + ", ");
		}
		System.out.println();
		System.out.println("done");
	}
}
