package app67;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class M23 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(true);
		list.add(false);
		list.add(true);
		list.add(false);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("----------------");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		System.out.println("----------------------");
		HashSet set = new HashSet();
		list.clear();
		list.addAll(set);
		System.out.println(list);
		System.out.println(list.size());
	}
}
