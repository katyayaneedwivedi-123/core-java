package set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q43 {
	public static void main(String[] args) {
		int[] a1 = {4, 3, 5, 9};
		int[] a2 = {51, 4, 32, 8, 3, 11, 5, 25, 6, 20};
		System.out.println("initial: " + Arrays.toString(a1));
		System.out.println("initial: " + Arrays.toString(a2));
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i : a1) {
			map.put(i, 1);
		}
		List<Integer> list = new ArrayList<Integer>();
		for(int i : a2) {
			if(map.containsKey(i)) {
				list.add(i);
			}
		}
		a2 = new int[list.size()];
		for(int i = 0; i < a2.length; i++) {
			a2[i] = list.get(i);
		}
		System.out.println("final");
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
	}
}
