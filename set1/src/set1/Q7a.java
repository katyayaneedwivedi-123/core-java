package set1;

public class Q7a {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 40, 50, 100, 70, 88, 333};
						//	0, 1,  2,  3,  4,  5,  6,  7,  8
						//	length = 9
		//middle is a part of first half
		for(int i = 0; i < (elements.length / 2) + 1; i++) {
			System.out.print(elements[i] + ", ");
		}
		System.out.println();
		System.out.println("done");
	}
}
