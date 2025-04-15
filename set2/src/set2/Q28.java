package set2;

import java.util.Arrays;

public class Q28 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		int  temp = elements[0];
		for(int i = 0; i < elements.length - 1 ; i++) {
			elements[i] = elements[i + 1];
		}
		elements[elements.length - 1] = temp;
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//Do left rotate by one for elements of given array?