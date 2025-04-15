package app70;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class M16 {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		map.put("abc", 23);
		map.put("xyz", 123);
		map.put(null, 231);
		map.put("hello", 223);
		map.put("java", 232);
		map.put("btm", 223);
		map.put("mobile", 423);
		System.out.println(map);
	}
}
//in HashTable don't allow null as key null as value
//we are give null as key so we are getting
//NullPointerException