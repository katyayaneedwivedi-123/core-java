package app85;
interface F{
	default void test1() {
		System.out.println("F-test1");
	}
}

interface G{
	default void test1() {
		System.out.println("G-test1");
	}
}
//class H implements F, G {
//	
//}
public class M5 {

}
//both method have not implement the same class b/c default method name is same so it give ambeguity
//b/c of this reaso java not allow multiple inheritance through classes