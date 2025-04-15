package set1;

public class Q22 {
	public static void main(String[] args) {
		int[] elements = {57, 20, 30, 40, 50, 27, 70, 88, 777};
						//	0, 1,  2,  3,  4,  5,  6,  7,  8
						//	length = 9
		
		for(int i = 0; i < elements.length ; i++) {
			if((elements[i] % 2 == 0)) {
				System.out.println(elements[i] + ", ");
			}
		}
		System.out.println("done");
	}
}
//only even elements has to read