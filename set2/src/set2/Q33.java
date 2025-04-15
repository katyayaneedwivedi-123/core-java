package set2;

import java.util.Arrays;

public class Q33 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		int temp1 = elements[0];
		int temp2 = elements[elements.length / 2];
		for(int i = 0; i < elements.length / 2 - 1; i++) {
			elements[i] = elements[i + 1];
		}
		elements[elements.length / 2 - 1] = temp1;
		for(int i = elements.length / 2; i < elements.length - 1; i++) {
			elements[i] = elements[i + 1];
		}
		elements[elements.length - 1] = temp2;
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//Rotate first half of elements by one and 2nd half of the elements by one separately?