package set2;

import java.util.Arrays;

public class Q19 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		for(int i = elements.length - 1; i > 0; i --) {
			elements[i] = elements[i - 1];
		}
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//Do right shift by one for elements of given array?