package set1;

import java.util.Arrays;

public class Q37 {
	public static void main(String[] args) {
		int[] elements = {57, 20, 30, 44, 50, 27, 70, 4, 88, 77};
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < elements.length; i++) {
			if(elements[i] > max) {
				max = elements[i];
				Arrays.sort(elements);
			}
		}
		System.out.println(max);
		System.out.println("done");
	}
}
//Find the 2nd max element?