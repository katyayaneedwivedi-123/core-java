package app67;

import java.util.ArrayList;

public class M10 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10000);
		list1.add("abc");
		list1.add(8.7);
		list1.add('e');
		list1.add(false);
		System.out.println(list1);
		System.out.println("----------");
		ArrayList list2 = new ArrayList();
		list2.add("xyz");
		list2.add("hello");
		list2.add(34);
		list2.add(23);
		list2.addAll(list1);//it use to add all extra the element in list 1 to list2
		System.out.println(list1);
		System.out.println(list2);
	}
}
