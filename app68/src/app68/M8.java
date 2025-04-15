package app68;

import java.util.Stack;

public class M8 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		System.out.println(stack);
		System.out.println(stack.search(300));
		System.out.println(stack.search(1300));
	}
}
//use of the search method we are get the  order or rank number where the value is available 
//if value is not available then it give the -1 order number