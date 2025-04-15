package set2;

import java.util.Arrays;

public class Q26 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		int temp = elements[elements.length - 2];
		int temp1 = elements[elements.length - 1];
		for(int i = elements.length - 1; i > 1; i--) {
			elements[i] = elements[i - 2];
		}
		elements[0] = temp;
		elements[1] = temp1;
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//Do right rotate by two for elements of given array?