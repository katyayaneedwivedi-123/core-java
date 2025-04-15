package app69;

import java.util.Set;
import java.util.TreeSet;

public class M10 {
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
		Set<Integer> set1 = set.headSet(30);//include value is includes
		System.out.println(set1);
	}
}
//tree having a navigable feature
//navigable means it not store the given more than value 
//means given value is limitation of the value