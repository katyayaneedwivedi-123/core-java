package app70;

import java.util.Map;
import java.util.TreeMap;

public class M12 {
	public static void main(String[] args) {
		TreeMap<String, Double> map = new TreeMap<String, Double>();
		map.put("key", 23.1);
		map.put("pair", 33.1);
		map.put("dada", 29.2);
		map.put("jhds", 56.4);
		map.put("kdsgh", 89.6);
		System.out.println(map);
		Map<String, Double> map1 = map.headMap("kay");
		System.out.println(map1);
	}
}
