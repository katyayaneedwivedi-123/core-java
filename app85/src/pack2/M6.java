package pack2;

import java.util.HashMap;
import java.util.Map;

public class M6 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "abc");
		map.put(9, "xyz");
		map.put(8, "test");
		map.put(7, "done");
		map.put(6, "check");
		System.out.println(map);
		map.put(8, "new test");//it is replacing
		System.out.println(map);
		map.putIfAbsent(7, "new done");//if value is absent then it print otherwise not replace
		System.out.println(map);
	}
}
//putIfAbsent is more recommended in jdk 1.7