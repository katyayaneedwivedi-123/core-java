package set2;

import java.util.Arrays;

public class Q6 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial:" + Arrays.toString(elements));
		int sum = 0;
		int avg = 0;
			sum = elements[0] + elements[elements.length - 1];
			avg = sum / 2;
		elements[elements.length / 2] = avg;
		System.out.println("final:" + Arrays.toString(elements));
	}
}
//Update middle element with the avg of first and last element.
