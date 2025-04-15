package pack1;

import java.util.Scanner;

public class M45 {
	public static void main(String[] args) {
		System.out.println(1);
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter your age");
		int age = sc.nextInt();
		if(age <= 0) {
			throw new ArithmeticException("age should be greater than 0");
		}
		//continue...
		System.out.println(3);
	}
}
//if we enter the age is 0 or less than 0 then it give error
//then it said no need of continue
