package set2;

import java.util.Arrays;

public class Q3 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40};
		//					0	1	2	3	4	5	6	7
		System.out.println("initial:" + Arrays.toString(elements));
		elements[0] = elements[elements.length-1];
		System.out.println("initial:" + Arrays.toString(elements));
	}
}
//Update first element with the last element.