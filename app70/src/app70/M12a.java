package app70;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class M12a {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 23);
		map.put("xyz", 123);
		map.put("test", 231);
		map.put("hello", 223);
		map.put("java", 232);
		map.put("btm", 223);
		map.put("mobile", 423);
		Set<Entry<String, Integer>> entries = map.entrySet();
		System.out.println(entries);
	}
}
//every entry reading into set object there is a entry set method
//set method containing multiple entries
//entry also taking 2 generics