package app67;

import java.util.ArrayList;

public class M13 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10000);
		list1.add("abc");
		list1.add(8.7);
		list1.add('e');
		list1.add(false);
		ArrayList list2 = new ArrayList();
		list2.add("xyz");
		list2.add("hello");
		list2.add(8.7);
		list2.add(false);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("----------");
		list1.retainAll(list2);
		System.out.println(list1);
		System.out.println(list2);
	}
}
//list1.retainAll(list2); whichever element is not available in list2 in list1 it remove