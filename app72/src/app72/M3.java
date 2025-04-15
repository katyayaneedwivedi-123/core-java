package app72;

import java.util.HashMap;
import java.util.HashSet;

class C {
	int i, j;
	C(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ")";
	}
	@Override
	public int hashCode() {
		int hash = Integer.toString(i).hashCode();
		hash += Integer.toString(j).hashCode();
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		boolean flag = (obj instanceof C)&&
				(i == ((C)obj).i)&&
				(j == ((C)obj).j);
		return flag;
	}
}
public class M3 {
	public static void main(String[] args) {
		HashMap<C, String> map = new HashMap<C, String>();
		map.put(new C(90,56), "abc");
		map.put(new C(190, 78), "xyz");
		map.put(new C(9201, 3453), "test");
		map.put(new C(0271, 89), "done");
		System.out.println(map);
		
		HashSet<C> set = new HashSet<C>();
		set.add(new C(332, 565));
		set.add(new C(567, 345));
		set.add(new C(897, 675));
		set.add(new C(364, 244));
		set.add(new C(698, 798));
		System.out.println(set);
	}
}
