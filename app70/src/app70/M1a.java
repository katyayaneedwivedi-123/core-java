package app70;

import java.util.HashMap;

public class M1a {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 23);
		map.put("xyz", 123);
		map.put("test", 231);
		map.put("hello", 223);
		map.put("java", 232);
		map.put("btm", 223);
		map.put("mobile", 423);
		System.out.println(map);
	}
}
//HashMap is not maintain the order
//1st argument is a key and second is a value or element 
//in there no add method 
//in there put method used for addition
//the combination of key and value is called one entry