package app70;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class M7 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		map.put(89, "sfs");
		map.put(39, "qwe");
		map.put(49, "tyr");
		map.put(99, "try");
		map.put(34, "hjk");
		map.put(94, "Xfv");
		map.put(56, "SAD:");
		map.put(21, "tyty");
		System.out.println(map);
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>(Collections.reverseOrder());
		map1.putAll(map);
		System.out.println(map1);
	}
}
