package app67;

import java.util.ArrayList;
import java.util.Collections;

public class M16 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10000);
		list1.add(90);
		list1.add(910);
		list1.add(190);
		list1.add(950);
		list1.add(590);
		list1.add(990);
		System.out.println(list1);
		Collections.sort(list1);//it sort the list
		System.out.println(list1);
	}
}
