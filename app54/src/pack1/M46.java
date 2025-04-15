package pack1;
import java.util.Scanner;

class AgeNegativeException extends ArithmeticException {
	AgeNegativeException(){
		
	}
	AgeNegativeException(String msg){
		super(msg);
	}
//these two constructor is optional if we are not provide then compiler provide this
}
//public class M46 {
//	public static void main(String[] args) {
//		System.out.println(1);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("pls enter your age");
//		int age = sc.nextInt();
//		if(age <= 0) {
//			throw new ArithmeticException("age should be greater than 0");
//		}
//		//continue...
//		System.out.println(3);
//	}
//}
public class M46{
	public static void main(String[] args) {
		System.out.println(1);
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter your age");
		int age = sc.nextInt();
		if(age <= 0) {
			throw new AgeNegativeException("age should be greater than 0");
		}
		//continue...
		System.out.println(3);
	}
}

//user defined or own defined classes always unchecked