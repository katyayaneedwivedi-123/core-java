package app70;

import java.util.HashMap;

public class M3 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(67, 56);
		map.put(62, 56);
		map.put(34, 23);
		map.put(34, 33);
		map.put(89, 78);
		map.put(99, 78);
		System.out.println(map);
	}
}
//if 2 pair if the left hand side value is same then it give the second pair not first pair 
//but if right hand side value is same then it give the both pair 