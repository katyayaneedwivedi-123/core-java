package app67;

import java.util.ArrayList;

public class M2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(2389);
		list.add("xyz");
		list.add(5.9);
		list.add('k');
		list.add(true);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
	}
}
