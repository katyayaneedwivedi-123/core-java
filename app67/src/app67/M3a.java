package app67;

import java.util.ArrayList;

public class M3a {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10000);
		list.add("abc");
		list.add(8.7);
		list.add('e');
		list.add(false);
		System.out.println(list);
		list.set(2, "test");
		System.out.println(list);
	}
}
//list.set(2, "test"); replacing the element for the specify index