package app70;

import java.util.TreeMap;

public class M14 {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		map.put(23, 34);
		map.put(89, 90);
		map.put(67, 56);
		map.put(77, 89);
		map.put(34, 65);
		System.out.println(map);
		System.out.println(map.ceilingKey(79));
		System.out.println(map.floorKey(67));
	}
}
