package app70;

import java.util.HashMap;

public class M2 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println(map.put(90, 23));
		System.out.println(map.put(90, 23));
		System.out.println(map.put(89, 123));
		System.out.println(map.put(99, 233));
		System.out.println(map.put(89, 123));
		System.out.println(map.put(99, 233));
		System.out.println(map.put(45, 344));
		System.out.println(map.put(45, 344));
		System.out.println(map);
	}
}
//it take first pair as duplicate so it give null and 