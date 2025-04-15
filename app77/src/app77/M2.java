package app77;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class M2 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("xyz");
		StringBuffer s2 = new StringBuffer("abc");
		ArrayList<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(s1);
		list.add(s2);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		TreeSet<StringBuffer> set = new TreeSet<StringBuffer>();
		set.add(s1);
		set.add(s2);
		System.out.println(set);
//	Collections.sort(list);
		System.out.println(set);
	}
}
//in stringBuffer and StringBuilder both are implementing the comparable
//so it sorted automatically