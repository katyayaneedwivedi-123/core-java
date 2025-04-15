package app70;

import java.util.HashMap;
import java.util.Map;

public class M7a {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 300);
		map.putIfAbsent("abc", 400);//if the value is absent then it give the value otherwise not give the value
		map.putIfAbsent("xyz", 355);
		System.out.println(map);
	}
}
