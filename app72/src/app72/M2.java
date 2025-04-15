package app72;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class B{
	int i;
	B(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "(" + i + ")";
	}
	@Override
	public int hashCode() {
		return Integer.toString(i).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return(obj instanceof B) &&
				(i == ((B) obj).i);
	}
}
public class M2 {
	public static void main(String[] args) {
		HashSet<B> set = new HashSet<B>();
		set.add(new B(90));
		set.add(new B(90));
		set.add(new B(190));
		set.add(new B(190));
		set.add(new B(940));
		set.add(new B(905));
		System.out.println(set);
		
		HashMap<B, String> map = new HashMap<B, String>();
		map.put(new B(90), "abc");
		map.put(new B(190), "xyz");
		map.put(new B(920), "abc");
		map.put(new B(904), "test");
		map.put(new B(90), "abc");
		System.out.println(map);
	}
}
//toString HashCode and Equals methods use to avoid the duplicate