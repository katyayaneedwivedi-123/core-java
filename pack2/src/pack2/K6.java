package pack2;

import java.util.Scanner;

public class K6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter something");
		int i = sc.nextInt();
		int j = sc.nextInt();
		try {
			double c = i / j;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero is not allowed");
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid input pls enter numbers");
		}
	}
}
