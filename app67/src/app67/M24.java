package app67;

import java.util.HashSet;
import java.util.Vector;

public class M24 {
	public static void main(String[] args) {
		Vector list = new Vector();
		list.add(67);
		list.add(2.3);
		list.add("Dwivedi");
		list.add('k');
		list.add(true);
		System.out.println(list);
		System.out.println(list.get(2));
		list.set(3, false);
		System.out.println(list);
		list.add(3, 'k');
		System.out.println(list);
		System.out.println(list.remove(false));
		System.out.println(list);
		System.out.println("-----------");
		Vector list1 = new Vector();
		list1.add("name");
		list1.add(false);
		list1.add('d');
		list1.add(5.5);
		list1.add(89);
		list1.addAll(list);
		System.out.println(list);
		System.out.println(list1);
		System.out.println("---------------");
		list1.removeAll(list);
		System.out.println(list);
		System.out.println(list1);
		System.out.println("----------------------");
		System.out.println(list1.contains("name"));
		System.out.println(list.contains(87));
		System.out.println(list);
		System.out.println(list1);
		System.out.println("--------------------------------");
		Vector list2 = new Vector();
		list2.add("rani");
		list2.add(7346);
		list2.add('s');
		list2.add(true);
		list2.add(99.9);
		list2.add("rani");
		list2.add(7346);
		list2.add('s');
		list2.add(true);
		list2.add(99.9);
		System.out.println(list2);
		HashSet set = new HashSet(list2);
		list2.clear();
		list2.addAll(set);
		System.out.println(list2);
	}
}
