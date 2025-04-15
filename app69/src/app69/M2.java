package app69;

import java.util.HashSet;

public class M2 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println(set.add(9000));
		System.out.println(set.add(9000));
		System.out.println(set.add(19000));
		System.out.println(set.add(19000));
		System.out.println(set.add(19006));
		System.out.println(set.add(19006));
		System.out.println(set);
	}
}
//set.add(value); method type is boolean means 
//if add is successfully then it return true 
//if not successfully then it return false