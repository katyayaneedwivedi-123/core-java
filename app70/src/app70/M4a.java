package app70;

import java.util.HashMap;
import java.util.Map;

public class M4a {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", null);
		map.put("test", null);
		map.put("hello", null);
		System.out.println(map);
	}
}
//HashMap allows null as a key null as a value or elements