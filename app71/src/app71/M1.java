package app71;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
 class A{
	 int i;
	 A(int i){
		 this.i = i;
	 }
 }
public class M1 {
	public static void main(String[] args) {
		List<A> list = new ArrayList<A>();
		list.add(new A(90));
		list.add(new A(190));
		list.add(new A(901));
		list.add(new A(920));
		list.add(new A(390));
		System.out.println(list);
		
		Map<A, String> map = new HashMap<A, String>();
		map.put(new A(90), "abc");
		map.put(new A(190), "xyz");
		map.put(new A(1910), "hello");
		System.out.println(map);
		
		Set<A> set = new HashSet<A>();
		set.add(new A(90));
		set.add(new A(190));
		set.add(new A(910));
		set.add(new A(901));
		set.add(new A(290));
		set.add(new A(905));
		System.out.println(set);
	}
}
//in every wrapper class toStirng method override
//inside class A toString method not override it calling object
//whenever we use the data type as a class name then this method got override
//through out collection api where we define the user define the data type then all the method are toString method override
//if we are not getting the content of the element while printing the reference of collection api the method is not override