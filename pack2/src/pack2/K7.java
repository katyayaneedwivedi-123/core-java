package pack2;

import java.util.Scanner;

class InsufficientFundsException extends ArithmeticException{
	public InsufficientFundsException(String message) {
		super(message);
}
}
public class K7 {
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("pls enter the funds");

	int a = sc.nextInt();
	try{

	if(a <= 0){
		throw new InsufficientFundsException("funds are not sufficient!");
	}
	}

	catch(InsufficientFundsException e){
		System.out.println(e);

	}

	}
}


