package pack1;
interface B{
	void test1();
}
class C {
	static void m1() {
		System.out.println("i am from m1");
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = C :: m1;
		b1.test1();
	}
}
//i want to create an object in B but b is interface it have a test method
//so we can assign m1 :: to  C
//interface B is having a unimplemented method same unimplemented method we can assign in m1
//m1 is a part of C so we assign ::
//what ever method in them1 same in the test method