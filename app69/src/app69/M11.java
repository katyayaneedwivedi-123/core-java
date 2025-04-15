package app69;

import java.util.Set;
import java.util.TreeSet;

public class M11 {
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
		Set<Integer> set1 = set.headSet(30);
		System.out.println(set1);
		Set<Integer> set2 = set.tailSet(30);
		System.out.println(set2);
	}
}
//in head set specified number is not included
//but in the tail set specified number is included but it give the value in the given number to the last number