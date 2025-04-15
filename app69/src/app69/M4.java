package app69;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class M4 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
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
	}
}
//LinkedHashSet is used b/c it preserving the order
//and also avoid the duplicates