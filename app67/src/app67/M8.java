package app67;

import java.util.ArrayList;

public class M8 extends ArrayList {
	public static void main(String[] args) {
		M8 list = new M8();
		list.add(10000);
		list.add("abc");
		list.add(8.7);
		list.add('e');
		list.add(false);
		list.add(true);
		list.add(23);
		list.add("xyz");
		System.out.println(list);
		list.removeRange(1, 5);
		System.out.println(list);
	}
}
//protected member use subclass in another package
//removeRange method can not use directly we use throw subclass