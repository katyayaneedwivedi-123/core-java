package app70;

import java.util.Collections;
import java.util.TreeMap;

public class M8 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(Collections.reverseOrder());
		map.put(89, "sfs");
		map.put(39, "qwe");
		map.put(49, "tyr");
		map.put(99, "try");
		map.put(34, "hjk");
		map.put(94, "Xfv");
		map.put(56, "SAD:");
		map.put(21, "tyty");
		System.out.println(map);
	}
}
