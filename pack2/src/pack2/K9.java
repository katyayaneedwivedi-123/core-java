package pack2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class A{
	int i;
	A(int i){
		this.i = i;
	}
}
public class K9 {
	public static void main(String[] args) {
		List<A> list = new ArrayList<A>();
		list.add(new A(90));
		list.add(new A(190));
		list.add(new A(930));
		list.add(new A(906));
		list.add(new A(570));
		System.out.println(list);
		
		HashMap<A, String> map = new HashMap<A, String>();
		map.put(new A(89), "abc");
		map.put(new A(39), "hjh");
		map.put(new A(88), "sfd");
		map.put(new A(56), "jhu");
		map.put(new A(23), "ade");
		System.out.println(map);
		
		HashSet<A> set = new HashSet<A>();
		set.add(new A(23));
		set.add(new A(36));
		set.add(new A(98));
		set.add(new A(72));
		set.add(new A(65));
		System.out.println(set);
	}
}
