package app71;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class C{
	int i, j;
	C(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "[i = " + i + ", j = " + j + "]";
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(9, 12);
		C c2 = new C(19, 121);
		C c3 = new C(49, 124);
		C c4 = new C(98, 182);
		List<C> list = new ArrayList<C>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		System.out.println(list);
		
		Set<C> set = new HashSet<C>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		System.out.println(set);
		
		Map<C, String> map = new HashMap<C, String>();
		map.put(c1, "abc");
		map.put(c2, "xyz");
		map.put(c3, "test");
		map.put(c4, "done");
		System.out.println(map);
	}
}
//in toString method is very recommended to provide the brackets
//in all collection api user defined dataType is got override