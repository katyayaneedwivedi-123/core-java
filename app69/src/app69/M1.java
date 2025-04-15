package app69;

import java.util.HashSet;

public class M1 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(9000);
		set.add(9000);
		set.add(9000);
		set.add(9000);
		set.add(9000);
		System.out.println(set);
	}
}
//set is not allow the duplicates so it give only one 9000
//in hash set we can add the duplicate it run and compile successfully
//it simply ignore the duplicates