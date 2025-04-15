package set2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q47 {
	public static void main(String[] args) {
		int[] a1 = {4, 3, 4, 4, 4, 5, 4, 8, 1, 8, 9, 9, 1, 9};
		System.out.println("initial: " + Arrays.toString(a1));
		for(int i = 1; i < a1.length - 1; i++) {
			if(a1[i - 1] == a1[i + 1]) {
				System.out.print(i + ", ");
			}
		}
	}
}
//47.	Find out index of an element which contains left indexed element is same as right indexed element. 