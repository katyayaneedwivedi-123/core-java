package app69;

import java.util.Set;
import java.util.TreeSet;

public class M13 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(15);
		set.add(16);
		set.add(70);
		set.add(80);
		set.add(19);
		set.add(101);
		set.add(102);
		System.out.println(set);
		System.out.println(set.ceiling(22));//it give the nearest bigger value if it is not available here
		System.out.println(set.floor(22));//it give the nearest smaller value if given value is not available
	}
}
