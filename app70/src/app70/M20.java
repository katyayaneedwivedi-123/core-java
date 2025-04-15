package app70;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class M20 {
	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("abc", 23);
		map.put("xyz", 123);
		map.put("test", 231);
		map.put("hello", 223);
		map.put("java", 232);
		map.put("btm", 223);
		map.put("mobile", 423);
		System.out.println(map);
	}
}
//we can direct do the sorting use of the treeMap
//direct we can store the sorted entry in the treeMap