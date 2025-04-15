package set2;

import java.util.Arrays;

public class Q8a {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		elements[0] = elements[0] + elements[elements.length - 1];//10 + 500 = 510
		elements[elements.length - 1] = elements[0] - elements[elements.length - 1];//510 - 500 = 10
		elements[0] = elements[0] - elements[elements.length - 1];//510 - 10 = 500
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//without the using temp variable swaping in first with last elements 