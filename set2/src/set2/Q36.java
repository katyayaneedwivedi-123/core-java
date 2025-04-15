package set2;

import java.util.Arrays;

public class Q36 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 20, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		int element= 120;
		int total = 0;
		for(int i = 0; i < elements.length; i++) {
			if(elements[i] == element) {
				rigthShift(elements, i);
				total++;
			}
		}
		int[] temp = elements;
		elements = new int[temp.length - total];
		for(int i = 0; i < elements.length; i++) {
			elements[i] = temp[i + total];
		}
		System.out.println("final: " + Arrays.toString(elements));
	}
	private static void rigthShift(int[] elements, int index) {
		for(int i = index; i > 0; i--) {
			elements[i] = elements[i - 1];
		}
	}
}
//loop inside a loop is not recommended
//Remove all occurrences of specified element from the given array?
//use of right shift by one we are used to remove the duplicates