package pack2;

import java.util.HashMap;
import java.util.Set;

public class K8 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("are", 34);
		map.put("abc", 56);
		map.put("you", 89);
		map.put("djfh", 78);
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(map.get(key));
		}
	}
}
