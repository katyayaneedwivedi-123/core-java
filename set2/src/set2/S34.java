package set2;

import java.util.Arrays;

public class S34 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		//					0, 1,  2,   3,   4, 5,  6,  7,   8
		System.out.println("initail: " + Arrays.toString(elements));
		int index = 3;
		for(int i = index; i > 0; i--) {
			elements[i] = elements[i - 1];
		}
		int[] temp = elements;
		elements = new int[elements.length - 1];
		for(int i = 0; i < elements.length; i++) {
			elements[i] = temp[i + 1];
		}
		System.out.println("final: " + Arrays.toString(elements));
	}
}
