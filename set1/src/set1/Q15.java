package set1;

public class Q15 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 40, 50, 100, 70, 88};
						//	0, 1,  2,  3,  4,  5,  6,  7
						//	length = 8
		for(int i = 1; i < elements.length - 1; i++) {
			System.out.println(elements[i] + ", ");
		}
		System.out.println("done");
	}
}
//first and last element is not considering and remaining all the elements are reading