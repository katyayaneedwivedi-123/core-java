package app70;

import java.util.HashMap;
import java.util.Map;

public class M3a {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(null, 3000);
		map.put(null, 4000);
		map.put(null, 5000);
		map.put(null, 6000);
		System.out.println(map);
	}
}
//HashMap allows null as key
//it also avoid the duplicate