package set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 10, 20, 500, 20, 10, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		List<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < elements.length; i++) {
			if(!nums.contains(elements[i])) {
				nums.add(elements[i]);
			}
		}
		elements = new int[nums.size()];
		for(int i = 0; i < elements.length; i++) {
			elements[i] = nums.get(i);
		}
		
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//40.	Remove the duplicates from the given array? 