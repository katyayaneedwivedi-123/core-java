package app70;

import java.util.HashMap;
import java.util.TreeMap;

public class M5 {
	public static void main(String[] args) {
		HashMap<Integer, Double> map = new HashMap<Integer, Double>();
		map.put(89, 23.3);
		map.put(89, 23.3);
		map.put(49, 3.3);
		map.put(49, 3.13);
		map.put(34, 2.3);
		map.put(94, 2.3);
		map.put(56, 23.6);
		map.put(21, 67.87);
		System.out.println(map);
		TreeMap<Integer, Double> map1 = new TreeMap<Integer, Double>(map);
		System.out.println(map1);
	}
}
