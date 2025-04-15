package app70;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class M19 {
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
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>(Collections.reverseOrder());
		map1.putAll(map);
		System.out.println(map1);
	}
}
//we can do the sorting in reverse order use of the treeMap