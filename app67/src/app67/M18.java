package app67;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class M18 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10000);
		list1.add(90);
		list1.add(910);
		list1.add(190);
		list1.add(950);
		list1.add(590);
		list1.add(960);
		list1.add(10000);
		list1.add(90);
		list1.add(910);
		list1.add(190);
		list1.add(950);
		list1.add(590);
		list1.add(960);
		System.out.println(list1);
		HashSet set = new HashSet(list1);//it removing the duplicates
		list1.clear();
		list1.addAll(set);//it take only unique value
		System.out.println(list1);
	}
}
//hash set is not provide the order it remove only duplicates