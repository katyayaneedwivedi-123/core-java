package set1;

public class Q10 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 40, 50, 100, 70, 88};
						//	0, 1,  2,  3,  4,  5,  6,  7
						//	length = 8
		for(int i = ((elements.length ) / 2) - 1; i >= 0; i--) {
			System.out.print(elements[i] + ", ");
		}
		System.out.println();
		System.out.println("done");
	}
}
