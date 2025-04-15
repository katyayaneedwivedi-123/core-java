package app72;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import app72.A;

class A{
	int i;
	A(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "[i = " + i + "]";
	}
}
public class M1 {
	public static void main(String[] args) {
		HashSet<A> set = new HashSet<A>();
		set.add(new A(90));
		set.add(new A(90));
		set.add(new A(90));
		set.add(new A(90));
		System.out.println(set);
		
		Map<A, String> map = new HashMap<A, String>();
		map.put(new A(100), "abc");
		map.put(new A(100), "xyz");
		map.put(new A(100), "hello");
		map.put(new A(100), "test");
		System.out.println(map);
	}
}
//it allow only HashSet and HashMap 
//in here duplication allow it not effect the code 
//means all duplicates come in the output 