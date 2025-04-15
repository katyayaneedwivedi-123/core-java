package app85;

interface P{
	void test1();
}

interface Q{
	void test1();
}

class R implements P, Q{
	public void test1() {
		System.out.println("R-test1");
	}
}
public class M7 {

}
//both two abstract method same name is implement in class
//we are not getting an ambiguity