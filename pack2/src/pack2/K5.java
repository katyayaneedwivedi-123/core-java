package pack2;

import java.util.Scanner;
class MisMatchException extends ArithmeticException{
	MisMatchException(){
		
	}
	MisMatchException(String value){
		super(value);
	}
}
public class K5 extends MisMatchException{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter something");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			if(a >= 0 && b >= 0) {
				double c= a / b;
				System.out.println(c);
				throw new MisMatchException("pls enter number");
			}
		}
		catch(MisMatchException e) {
			System.out.println(e);
		}
	}
}
