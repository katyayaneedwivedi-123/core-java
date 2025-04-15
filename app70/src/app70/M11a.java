package app70;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class M11a {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 23);
		map.put("xyz", 123);
		map.put("test", 231);
		map.put("hello", 223);
		map.put("java", 232);
		map.put("btm", 223);
		map.put("mobile", 423);
		Collection<Integer> values = map.values();
		System.out.println(values);
	}
}
//value can be duplicated so don't read this values return type is is collection