package set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q36b {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 20, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		int element= 120;
		int total = 0;
		for(int i = 0; i < elements.length; i++) {
			if(elements[i] == element) {
				total ++;
			}
		}
		int[] temp = elements;
		elements = new int[temp.length - total];
		for(int i = 0, j = 0; i < temp.length; i++) {
			if(temp[i] != element) {
				elements[j] = temp[i];
				j++;
			}
		}
		System.out.println("final: " + Arrays.toString(elements));
	}
}
