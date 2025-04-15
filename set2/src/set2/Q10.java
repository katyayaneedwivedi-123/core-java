package set2;

import java.util.Arrays;

public class Q10 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		for(int i = 0; i < elements.length; i++) {
			elements[i] = elements[i] * i;
		}
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//Update every element by multiplying an element with its index