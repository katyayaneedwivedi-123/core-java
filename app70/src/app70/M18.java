package app70;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class M18 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 23);
		map.put("xyz", 123);
		map.put("test", 231);
		map.put("hello", 223);
		map.put("java", 232);
		map.put("btm", 223);
		map.put("mobile", 423);
		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();
		map1.putAll(map);
		System.out.println(map1);
	}
}
//TreeMap is for both sorting and navigation
//putAll method store all the value in the map to map1
//sorting is based on the key not based on the value
//entries are sorted based on the keys