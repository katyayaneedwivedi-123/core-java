package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class M10 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(90);
		numbers.add(45);
		numbers.add(20);
		numbers.add(190);
		numbers.add(15);
		numbers.add(85);
		System.out.println(numbers);
		
		List<Integer> r1 = numbers.stream().map(t -> (t * 5)).collect(Collectors.toList());
		System.out.println(r1);
		
		List<Integer> r2 = numbers.stream().map(t -> (t % 2 == 0 ? t : t + 1)).collect(Collectors.toList());
		System.out.println(r2);
	}
}
//r1 is do the multiplication of 5 in numbers
//r2 is do the which number is divided by 2 then print the same number if not divided by then number add 1 and then print