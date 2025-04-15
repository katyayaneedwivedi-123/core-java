package set1;

public class Q16 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 40, 50, 100, 70, 88};
						//	0, 1,  2,  3,  4,  5,  6,  7
						//	length = 8
		for(int i = elements.length - 1; i >= 1; i--) {
			System.out.println(elements[i] + ", ");
		}
		System.out.println("done");
	}
}
//reading all the elements in reverse order skip only the first elements