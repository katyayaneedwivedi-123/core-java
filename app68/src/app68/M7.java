package app68;

import java.util.Stack;

public class M7 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		System.out.println(stack);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
//we use isEmpty method so it not empty then loop continue if it empty then loop stop
//[100, 200, 300, 400, 500]
//500
//400
//300
//200
//100   this is a output
