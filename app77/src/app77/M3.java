package app77;

import java.util.HashSet;

public class M3 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("abc");
		StringBuffer s2 = new StringBuffer("abc");
		HashSet<StringBuffer> set = new HashSet<StringBuffer>();
		set.add(s1);
		set.add(s2);
		System.out.println(set);
	}
}
//it not remove the duplicate b/c it have not override the hashcode and equals method