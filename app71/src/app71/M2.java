package app71;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class B{
	int i;
	B(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "(i = " + i + " )";
	}
}
public class M2 {
	public static void main(String[] args) {
		List<B> list = new ArrayList<B>();
		list.add(new B(90));
		list.add(new B(190));
		list.add(new B(910));
		list.add(new B(902));
		list.add(new B(930));
		list.add(new B(940));
		list.add(new B(490));
		System.out.println(list);
		
		Map<B, String> map = new HashMap<B, String>();
		map.put(new B(50), "abc");
		map.put(new B(34), "xyz");
		map.put(new B(98), "test");
		System.out.println(map);
		
		Set<B> set = new HashSet<B>();
		set.add(new B(67));
		set.add(new B(987));
		set.add(new B(324));
		set.add(new B(324));
		set.add(new B(467));
		set.add(new B(667));
		set.add(new B(679));
		System.out.println(set);
	}
}
