package set1;

import java.util.Arrays;

public class Q40 {
	public static void main(String[] args) {
		int[] elements = {57, 20, 30, 44, 50, 27, 70, 4, 88, 77};
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < elements.length; i++) {
			if((elements[i] % 2 == 1) && elements[i] < min) {
				min = elements[i];
				Arrays.sort(elements);
			}
		}
		System.out.println(min);
		System.out.println("done");
	}
}
//Find the 2nd min odd element?