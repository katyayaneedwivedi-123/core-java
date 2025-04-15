package set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q37 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 20, 35, 40, 500};
		System.out.println("initial: " + Arrays.toString(elements));
		int index1 = 2, index2 = 6;
		int total = index2 - index1;
		for(int i = index2; i < elements.length; i++) {
			elements[i - total] = elements[i];
		}
		int[] temp = elements;//it preserve the original elements arrays for temporary use
		elements = new int[temp.length - total];//Here, a new array elements is created with a reduced size 
		//(temp.length - total), where total is the number of elements removed.
		for(int i = 0; i < temp.length - total; i++) {
			elements[i] = temp[i];
		}//This loop copies the valid elements from the temp array into the newly resized elements array.
		System.out.println("final: " + Arrays.toString(elements));
	}
}
//Remove rang of elements from the given array