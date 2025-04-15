package set2;

import java.util.Arrays;

public class Q16 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		for(int i = 0; i < elements.length / 2; i += 2) {
				elements[i] = elements[i] + elements[elements.length - 1 - i];
				elements[elements.length - 1 - i] = elements[i] - elements[elements.length - 1 - i];
				elements[i] = elements[i] - elements[elements.length - 1 - i];
		}
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//Reverse only even indexed of the elements of given array?