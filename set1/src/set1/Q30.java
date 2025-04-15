package set1;

public class Q30 {
	public static void main(String[] args) {
		int[] elements = {57, 20, 30, 44, 50, 27, 70, 4, 88, 77};
		
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MIN_VALUE);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < elements.length; i++) {
			if(elements[i] < min) {
				min = elements[i];
			}
		}
		System.out.println(min);
		System.out.println("done");
	}
}
//every elements is comparing with the minimum
//Find the min element