package app70;

import java.util.Hashtable;
import java.util.Map;

public class M17 {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		map.put("abc", 23);
		map.put("xyz", 123);
		map.put("test", 231);
		map.put("hello", 223);
		map.put("java", null);
		map.put("btm", 223);
		map.put("mobile", 423);
		System.out.println(map);
	}
}
//we not store null as key and null as value in HashTable
//we getting NullPointerException