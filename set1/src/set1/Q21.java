package set1;

public class Q21 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 40, 50, 100, 70, 88, 777};
						//	0, 1,  2,  3,  4,  5,  6,  7,  8
						//	length = 9
		
		for(int i = elements.length - 1; i >= 0 ; i--) {
			if(i == (elements.length / 2)) {
				continue;
			}
			System.out.println(elements[i] + ", ");
		}
		System.out.println();
		System.out.println("done");
	}
}
