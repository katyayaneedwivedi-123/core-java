package app67;

import java.util.ArrayList;
import java.util.Collections;

public class M15 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10000);
		list1.add("abc");
		list1.add(8.7);
		list1.add('e');
		list1.add(false);
		System.out.println(list1);
		Collections.sort(list1);//it sort the list
		System.out.println(list1);
	}
}
//it give exception b/c sorting is done it the element are same type
//sorting is done through comparison 
//comparison can be done if elements are same type
//ClassCastException