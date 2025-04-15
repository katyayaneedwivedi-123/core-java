package app67;

import java.util.ArrayList;

public class M4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hfx");
		list.add(90);
		list.add(1.5);
		list.add(false);
		list.add('a');
		System.out.println(list);
		System.out.println(list.contains('a'));
		System.out.println(list.contains(898));
		System.out.println(list.contains("hfx"));
		System.out.println(list.contains(1.5));
	}
}
