package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class M1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(901);
		list.add(190);
		list.add(910);
		list.add(290);
		Stream<Integer> stream1 = list.stream();
		stream1.forEach(System.out :: println);
	}
}
//inside arraylist a method stream it print the content by using the for each method
//for each method is consumer we supply through :: 
//we printing the stream in list
//after creating the stream we can use to print 