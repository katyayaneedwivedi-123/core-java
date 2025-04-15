package app70;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class M15 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
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
//linkedHashMap is order is preserving
//it maintain only the value not the key order