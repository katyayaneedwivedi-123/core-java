package app70;

import java.util.HashMap;
import java.util.Map;

public class M5a {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 300);
		map.put("test", 500);
		map.put("hello", 600);
		System.out.println(map.get("abc"));
		System.out.println(map.get("test"));
		System.out.println(map.get("hello"));
		System.out.println(map.get("pqr"));
	}
}
//in hash map get method is available
//get method is take the key value and return a value
//if the key value is not here so it give the null