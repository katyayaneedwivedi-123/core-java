package set2;

import java.util.Arrays;

public class Q34a{
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		//					0, 1,  2,   3,   4, 5,  6,  7,   8
		System.out.println("initail: " + Arrays.toString(elements));
		int index = 3;
		int[] temp = elements;
		elements = new int[elements.length - 1];
		for(int i = 0; i < index; i++) {
			elements[i] = temp[i];
		}
		for(int i = index + 1; i < temp.length; i++) {
			elements[i - 1] = temp[i];
		}
		System.out.println("final: " + Arrays.toString(elements));
	}
}
