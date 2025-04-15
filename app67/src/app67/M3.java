package app67;

import java.util.ArrayList;

public class M3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9787);
		list.add("jhd");
		list.add(true);
		list.add('l');
		list.add(90.0);
		System.out.println(list);
		list.remove(true);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);
	}
}
