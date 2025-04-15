package app69;

import java.util.HashSet;
import java.util.TreeSet;

public class M5 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
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
		TreeSet<Integer> set1 = new TreeSet<Integer>(set);
		System.out.println(set1);
	}
}
//TreeSet do the value in the order