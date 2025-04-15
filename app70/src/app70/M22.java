package app70;

import java.util.TreeMap;

public class M22 {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("abc", 23);
		map.put("xyz", 123);
		map.put("test", 231);
		map.put("hello", 223);
		map.put("java", 232);
		map.put("btm", 223);
		map.put("mobile", 423);
		System.out.println(map);
		System.out.println(map.ceilingKey("tap"));//it give the nearest greatest value 
		System.out.println(map.floorKey("tap"));//it give the nearest smaller value
	}
}
