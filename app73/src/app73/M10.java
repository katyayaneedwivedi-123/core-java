package app73;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class P {
	int i;
	P(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "i = " + i;
	}
}
public class M10 {
	public static void main(String[] args) {
		List<P> list = new ArrayList<P>();
		list.add(new P(90));
		list.add(new P(90));
		list.add(new P(90));
		list.add(new P(90));
		list.add(new P(90));
		list.sort((p1, p2) -> p1.i - p2.i);
		System.out.println(list);
		
		Queue<P> queue = new PriorityQueue<P>((p1, p2) -> p1.i - p2.i);
		queue.add(new P(90));
		queue.add(new P(90));
		queue.add(new P(90));
		queue.add(new P(90));
		queue.add(new P(90));
		System.out.println(queue);
		
		Set<P> set = new HashSet<P>();
		set.add(new P(90));
		set.add(new P(90));
		set.add(new P(90));
		set.add(new P(90));
		set.add(new P(90));
		Set<P> treeSet = new TreeSet<P>((p1, p2) -> p1.i - p2.i);
		treeSet.addAll(set);
		System.out.println(set);
		System.out.println(treeSet);
		
		Map<P, Integer> map = new HashMap<P, Integer>();
		map.put(new P(90), 30);
		map.put(new P(90), 40);
		map.put(new P(90), 50);
		map.put(new P(90), 60);
		TreeMap<P, Integer> treeMap = new TreeMap<P, Integer>((p1, p2) -> p1.i - p2.i);
		treeMap.putAll(map);
		System.out.println(map);
		System.out.println(treeMap);
	}
}
//list allows duplicate
//list and Queue both are not able to identify the duplicates
//in the set method is able to identify the duplicates without the use of the hashCode() and  equals method use
//b/c it automatically know whichever attributes are mentions in the compare method same method used to identify
//in the TreeSet and TreeMap identify the duplicates without the  use of the hashCode and equals method use 
//it automatically identify whichever attributes mention in compare method same attributes used in the here to identify the duplicates 