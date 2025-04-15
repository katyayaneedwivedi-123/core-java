package app70;

import java.util.Map;
import java.util.TreeMap;

public class M10 {
	public static void main(String[] args) {
		TreeMap<String, Double> map = new TreeMap<String, Double>();
		map.put("key", 23.1);
		map.put("pair", 33.1);
		map.put("dada", 43.2);
		map.put("jhds", 56.4);
		map.put("kdsgh", 89.6);
		System.out.println(map);
		Map<String, Double> map1 = map.tailMap("dada", true);
		System.out.println(map1);
	}
}
