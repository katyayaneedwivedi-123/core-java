package app70;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class M10a {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 23);
		map.put("xyz", 123);
		map.put("test", 231);
		map.put("hello", 223);
		map.put("java", 232);
		map.put("btm", 223);
		map.put("mobile", 423);
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
//for each loop is not supporting to map
//for each loop give the all pair one by one
