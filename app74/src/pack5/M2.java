package pack5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class M2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("test", 200);
		map.put("abc", 2000);
		map.put("xyz", 2);
		map.put("test", 20);
		map.put("pqr", 500);
		map.put("java", 0);
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>(
				new Comparator() {
					public int compare(Object o1, Object o2) {
						System.out.println(o1 + ", " + o2);
						return map.get(o1) - map.get(o2);
					}//comapre method direct supply to the keys
				}
		);
		map1.putAll(map);
		System.out.println(map1);
	}
}
//compare method direct supply to the keys