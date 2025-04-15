package set2;

import java.util.Arrays;

public class Q12 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		for(int i = 0; i < elements.length - 1; i += 2) {
			elements[i] = elements[i] + elements[i + 1];//10 + 20 = 30
			elements[i + 1] = elements[i] - elements[i + 1];// 30 - 20 = 10
			elements[i] = elements[i] - elements[i + 1];// 30 - 10 = 20 same as others
		}
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//Swap odd indexed elements with an even indexed elements