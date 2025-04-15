package set1;

public class Q17 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 40, 50, 100, 70, 88};
						//	0, 1,  2,  3,  4,  5,  6,  7
						//	length = 8
		for(int i = elements.length - 2; i >= 0; i--) {
			System.out.println(elements[i] + ", ");
		}
		System.out.println("done");
	}
}
//read all the elements in the reverse order except(skip) last elements