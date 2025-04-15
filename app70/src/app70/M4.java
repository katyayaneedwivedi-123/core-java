package app70;

import java.util.Hashtable;

public class M4 {
	public static void main(String[] args) {
		Hashtable<Character, Double> map = new Hashtable<Character, Double>();
		map.put('d', 23.34);
		map.put('d', 33.34);
		map.put('r', 53.45);
		map.put('y', 53.45);
		map.put('a', 63.84);
		map.put('c', 63.84);
		map.put('w', 45.99);
		map.put('j', 22.3);
		System.out.println(map);
	}
}
