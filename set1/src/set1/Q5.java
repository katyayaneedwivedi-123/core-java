package set1;

public class Q5 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 40, 50, 100, 70, 88, 200};
					//		0, 1, 2,  3,  4,  5,   6,  7
					//		length = 9 
		int length = elements.length;
		int ans = elements[(length - 2)];
		System.out.println(ans);
		System.out.println(elements[(length - 2)]);
	}
}
