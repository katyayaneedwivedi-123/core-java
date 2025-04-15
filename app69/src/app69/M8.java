package app69;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class M8 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
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
//directly we can do the sorting in reverse order the use of the tree set