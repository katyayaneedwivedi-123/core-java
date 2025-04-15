package app75;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class M1 {
	public static void main(String[] args) {
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put("abc", 12);
//		map.put("xyz", 12);
//		map.put("test", 12);
//		map.put("java", 12);
//		System.out.println(map);
//		Iterator<String> it = map.keySet().iterator();
//		map.put("hello", 2000);
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		ConcurrentHashMap<String, Integer> map1 = new ConcurrentHashMap<String, Integer>();
		map1.put("abc", 12);
		map1.put("xyz", 12);
		map1.put("test", 12);
		map1.put("java", 12);
		System.out.println(map1);
		Iterator<String> it1 = map1.keySet().iterator();
		map1.put("hello", 2000);
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}
//HashMap and concurrent HashMap both are the same 
//HashMap give the exception but the concurrent HashMap not give the exception
//after the iterator we can add the operation in concurrent class it not give the exceptions
//in concurrent class which ever iterator used these are called the fail safe iterator