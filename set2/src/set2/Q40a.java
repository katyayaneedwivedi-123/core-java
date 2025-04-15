package set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40a {
	public static void main(String[] args) {
		int[] elements = {10, 20, 10, 20, 500, 20, 10, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		Arrays.sort(elements);
		System.out.println("after sorting: " + Arrays.toString(elements));
		int j = 0;
		for(int i = 1; i < elements.length; i++) {
			if(elements[j] != elements[i]) {
				j++;
				elements[j] = elements[i];
			}
		}
		int[] temp = elements;
		elements = new int[j + 1];//j + 1 is size of the array
		for(int i = 0; i < elements.length; i++) {
				elements[i] = temp[i];
		}
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//40.	Remove the duplicates from the given array? without use the collections and arraylist