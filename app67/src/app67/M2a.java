package app67;

import java.util.ArrayList;

public class M2a {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10000);
		list.add("abc");
		list.add(8.7);
		list.add('e');
		list.add(false);
		System.out.println(list);
		list.add(2, "test");
		System.out.println(list);
	}
}
//we use list.add(2, "test"); for insert the element for according to the index