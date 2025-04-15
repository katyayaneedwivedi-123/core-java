package app70;

import java.util.HashMap;
import java.util.Map;

public class M8a {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 300);
		System.out.println(map.get("abc"));
		System.out.println(map.get("xyz"));
		System.out.println(map.getOrDefault("abc", 0));
		System.out.println(map.getOrDefault("xyz", 0));
		System.out.println(map.getOrDefault("abc", 20));
		System.out.println(map.getOrDefault("xyz", 20));//it return 20 b/c it come in second time
	}
}
//getOrDefault method give value of the pair if it available if not available then give the null
