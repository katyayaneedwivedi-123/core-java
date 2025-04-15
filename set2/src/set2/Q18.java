package set2;

import java.util.Arrays;

public class Q18 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		for(int i = 1; i < elements.length - 1; i += 2) {
			elements[i] = elements[i] + elements[i + 1];
			elements[i + 1] = elements[i] - elements[i + 1];
			elements[i] = elements[i] - elements[i + 1];
		}
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//Swap odd indexed elements with its immediate next even indexed elements of given array?