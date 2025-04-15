package app70;

import java.util.HashMap;
import java.util.Map;

public class M6a {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 300);
		map.put("test", 500);
		map.put("hello", 600);
		System.out.println(map.containsKey("abc"));
		System.out.println(map.containsKey("test"));
		System.out.println(map.containsKey("hello"));
		System.out.println(map.containsKey("pqr"));
	}
}
//containsKey method take the key and check it available are not
//if available it give the true if not then give the false