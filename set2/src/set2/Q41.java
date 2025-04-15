package set2;

import java.util.Arrays;

public class Q41 {
	public static void main(String[] args) {
		int[] elements = {4, 3, 5, 8, 7};
		System.out.println("initial: " + Arrays.toString(elements));
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int naturalsum = 0;
		for(int i = 0; i < elements.length; i++) {
			if(elements[i] < min) {
				min = elements[i];
			}
			if(elements[i] > max) {
				max = elements[i];
			}
			sum += elements[i];
		}
		int n = max - min + 1;
		naturalsum = (n *(2 * min + (n - 1))) / 2;
		int missesdElements = naturalsum - sum;
		System.out.println(missesdElements);
	}
}
//41.	Find out missed elements from the given array between min and max element 