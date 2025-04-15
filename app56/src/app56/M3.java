package app56;

interface C{
	int test(int i, int j);
}
public class M3 {
	public static void main(String[] args) {
		C c1 = (i, j) -> 40;
		System.out.println(c1.test(10, 5));
		
		C c2 = (i, j) -> i + j;
		System.out.println(c2.test(10, 5));
		
		C c3 = (i, j) -> {
		System.out.println("from test");
		return i + j;
		};
		System.out.println(c3.test(10, 5));
		
	}
}
//method return type is other than void
//if the only value then it give the value not return statement it give the compilation error
//but if we have the multiple statement then it return the value the last statement is should be the return value