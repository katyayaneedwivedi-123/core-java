package set2;

import java.util.Arrays;

public class Q5 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40};
		System.out.println("initial:" + Arrays.toString(elements));
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < elements.length; i++) {
			if(max < elements[i]) {
				max = elements[i];
			}
		}
		elements[elements.length - 1] = max;
		System.out.println("final:" + Arrays.toString(elements));
	}
}
//Update last element with a max element