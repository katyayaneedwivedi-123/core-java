package app67;

import java.util.ArrayList;

public class M14 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10000);
		list1.add("abc");
		list1.add(8.7);
		list1.add('e');
		list1.add(false);
		System.out.println(list1);
		System.out.println(list1.contains("abc"));
		System.out.println(list1.contains("xyz"));
	}
}
//list1.contains("value"); method check which value is available in list
//if available then it return true otherwise it return false
//means it do search