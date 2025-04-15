package app69;

import java.util.Set;
import java.util.TreeSet;

public class M12 {
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
		Set<Integer> set1 = set.headSet(30, true);
		System.out.println(set1);
		Set<Integer> set2 = set.tailSet(30, false);
		System.out.println(set2);
	}
}
//in the head and the tail the second value is boolean that we 
//are give true or false to specify the given number is here or not
//if the number is true then it add if not then it not give the number