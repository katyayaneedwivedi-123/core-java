package pack2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class K26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First Input");
		int i = sc.nextInt();
		System.out.println("Second Input");
		int j = sc.nextInt();
		try {
			int c = i / j;
			System.out.println(c);
		}
		catch(ArithmeticException ex) {
			System.out.println("Arithmetic Exception");
			ex.printStackTrace();
			System.out.println("here Arithmethic Exception occur");
		}
		catch(InputMismatchException ex) {
			System.out.println("Input Mismatch EXception");
			ex.printStackTrace();
			System.out.println("here Input Mismatch Exception occur");
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Any Exception");
		}
		finally {
			System.out.println("no");
			sc.close();
		}
		System.out.println("pagal");
	}
}
