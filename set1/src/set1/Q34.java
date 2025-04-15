package set1;

public class Q34 {
	public static void main(String[] args) {
		int[] elements = {57, 20, 30, 44, 50, 27, 70, 3, 88, 777};
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < elements.length; i++) {
			if((elements[i] % 2 == 1) && elements[i] < min) {
				min = elements[i];
			}
		}
		System.out.println(min);
		System.out.println("done");
	}
}
//Find the min odd element?