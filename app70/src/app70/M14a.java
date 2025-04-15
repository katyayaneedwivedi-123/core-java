package app70;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class M14a {
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
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
//inside the entry object we have a getKey and getValue method we can read the key and value also