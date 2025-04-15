package set1;

import java.util.Arrays;

public class Q36 {
	public static void main(String[] args) {
		int[] elements = {57, 20, 30, 44, 50, 27, 70, 4, 88, 77};
//		
//		int min = Integer.MAX_VALUE;
//		for (int i = 0; i < elements.length; i++) {
//			if(elements[i] < min) {
//				min = elements[i];
//				Arrays.sort(elements);
//			}
//		}
//		System.out.println(min);
//		System.out.println("done");
//	}
	
	//above is also correct
	int min1 = Integer.MAX_VALUE;
	int min2 = Integer.MAX_VALUE;
	for (int i = 0; i < elements.length; i++) {
		if(elements[i] < min1) {
			min2 = min1;
			min1= elements[i];

		}
		else if(elements[i] < min2 && elements[i] > min1) {
			min2 = elements[i];
		}
	}
//	System.out.println(min1);
	if (min2 != Integer.MAX_VALUE) {
		System.out.println(min2);
	}
	else {
		System.out.println("no min2 value");
	}
	System.out.println(min2);
	System.out.println("done");
}
}
//this type questions are very much important
//Find the 2nd min element?
//in first 57 is lesser than min1 then it executing and min1 become a 57 and min2 = 57
//then 20 check it lesser then 57 it executing and become min1 = 20
//then 30 check it not lesser then 20 but it lesser than the 30 then it become the min2 = 30;
//then 44 check but it not lesser than and also it not lesser than the min2 so it not executing
//all are the same
//if we are give only the same value then it give the no 2 min value means then else block is executed
