package set2;

import java.util.Arrays;

public class Q35 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		int index = 3;
		int newElement = 8000;
		elements[index] = newElement;
		System.out.println("initial: " + Arrays.toString(elements));
	}
}
//Update specified indexed element with a new element from the given
//array?