package app73;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class A{
	int i;
	A(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "(" + i + ")";
	}
}
public class M1 {
	public static void main(String[] args) {
		List<A> list = new ArrayList<A>();
		list.add(new A(90));
		list.add(new A(190));
		list.add(new A(910));
		list.add(new A(902));
		list.add(new A(402));
		System.out.println(list);
//		Collections.sort(list);//this line not follow the 1 condition
		System.out.println(list);
	}
}
//if element is wrapper and String then the sorting is very successful
//whenever we are storing user defined container (class name) then 
//then we can not sort directly
//InCase of sorting 3 condition to be followed
//1. element should be comparable type or a separate comparator should be supply
//2. All the element should be same type
//3. no element can be a null if any one element is null we getting a null pointer exception
