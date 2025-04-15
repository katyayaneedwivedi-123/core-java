package set2;

import java.util.Arrays;

public class Q13 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		for(int i = 0; i < elements.length / 2; i ++) {
			elements[i] = elements[i] + elements[elements.length - 1 - i];//10 + 500 = 510
			elements[elements.length - 1 - i] = 
					elements[i] - elements[elements.length - 1 - i];//510 - 500 = 10
			elements[i] = elements[i] - elements[elements.length - 1 - i];//510 - 10 = 500
			//all are the same swapping
		}
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//middle elements swapping with the self and all other are in others
//Reverse the elements of given array?