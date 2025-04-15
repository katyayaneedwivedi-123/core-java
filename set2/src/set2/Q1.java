package set2;

import java.util.Arrays;

public class Q1 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40};
		//					0	1	2	3	4	5	6	7
		System.out.println("initial:" + Arrays.toString(elements));
		elements[0] = 100;
		System.out.println("initial:" + Arrays.toString(elements));
	}
}
//Update first element with 100.
//in order to print a array content use Arrays.toString method without the for loop we can print this