package app70;

import java.util.HashMap;

public class M2a {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println(map.put("abc", 23));
		System.out.println(map);
		System.out.println(map.put("abc", 213));
		System.out.println(map);
		System.out.println(map.put("abc", 413));
		System.out.println(map);
		System.out.println(map.put("xyz", 413));
		System.out.println(map);
		System.out.println(map.put("xyz", 13));
		System.out.println(map);
		System.out.println(map.put("xyz", 41));
		System.out.println(map);
		System.out.println(map.put("hello", 513));
		System.out.println(map);
		System.out.println(map.put("hello", 453));
		System.out.println(map);
		System.out.println(map.put("hello", 415));
		System.out.println(map);
	}
}
//in the hash map key value is unique