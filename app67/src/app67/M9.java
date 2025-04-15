package app67;

import java.util.ArrayList;

public class M9 {
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
		System.out.println(list1);
		System.out.println(list2);
	}
}