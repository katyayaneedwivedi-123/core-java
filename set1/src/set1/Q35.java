package set1;

public class Q35 {
	public static void main(String[] args) {
		int[] elements = {57, 20, 30, 44, 50, 27, 70, 3, 88, 777};
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < elements.length; i++) {
			if((elements[i] % 2 == 1) && elements[i] > max) {
				max = elements[i];
			}
		}
		System.out.println(max);
		System.out.println("done");
	}
}
//Find the max odd element?