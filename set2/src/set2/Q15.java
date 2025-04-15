package set2;

import java.util.Arrays;

public class Q15 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		int j = 0;
		for(int i = elements.length/ 2; i < elements.length - 3; i ++) {
			elements[i] = elements[i] + elements[elements.length- 1- j];
			elements[elements.length- 1- j] = 
					elements[i] - elements[elements.length- 1- j];
			elements[i] = elements[i] - elements[elements.length- 1- j];
			j++;
		}
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//Reverse only second half of the elements of given array?