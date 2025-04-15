package app70;

import java.util.HashMap;

public class M1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(89, "done");
		map.put(56, "pair");
		map.put(23, "duplicate");
		map.put(23, "duplicate");
		map.put(67, "order");
		map.put(67, "order");
		System.out.println(map);
	}
}
//it also remove the duplicate and not follow the order