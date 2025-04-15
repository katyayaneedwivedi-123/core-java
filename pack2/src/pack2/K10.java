package pack2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class B{
	int i;
	int j;
	B(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "[" + i + " , " + j +"]";
	}
}
public class K10 {
	public static void main(String[] args) {
		B b1 = new B(89, 67);
		B b2 = new B(34, 267);
		B b3 = new B(859, 647);
		B b4 = new B(678, 234);
		B b5 = new B(434, 907);
		
		List<B> list = new ArrayList<B>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		System.out.println(list);
		
		HashMap<B, String> map = new HashMap<B, String>();
		map.put(b1, "abc");
		map.put(b2, "ijk");
		map.put(b3, "lmn");
		map.put(b4, "pqr");
		map.put(b5, "cde");
		System.out.println(map);
		
		Set<B> set = new HashSet<B>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		System.out.println(set);
	}
}
