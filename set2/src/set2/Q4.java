package set2;

import java.util.Arrays;

public class Q4 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40};
		//					0	1	2	3	4	5	6	7
		System.out.println("initial:" + Arrays.toString(elements));
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < elements.length; i++) {
			if(min > elements[i]) {
				min = elements[i];
			}
		}
		elements[0] = min;
		System.out.println("initial:" + Arrays.toString(elements));
	}
}
//Update first element with a min element