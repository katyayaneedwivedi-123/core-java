package app84;

import java.io.PrintStream;

public class M14 {
	public static void main(String[] args) throws Exception{
		PrintStream p1 = new PrintStream("hello.txt");
		p1.println(1);
		System.out.println(2);
		PrintStream p2 = System.out;
		p2.println(3);
		p1.println(4);
		System.out.println(5);
	}
}
//p1 is targeting to hello.txt
//p2 is targeting to console and System.out also console