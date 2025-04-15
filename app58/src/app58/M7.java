package app58;
class G <A, B> {
	A s1;
	B s2;
	
	void test1(A arg1, B arg2) {
		System.out.println("done");
	}
}
public class M7 {
	public static void main(String[] args) {
		G<String, Integer> g1 = new G<String, Integer>();
		g1.s1 = "abc";
		g1.s2 = 345;
		g1.test1("abc", 345);
		
		G<Integer, Integer> g2 = new G<Integer, Integer>();
		g2.s1 = 23;
		g2.s2 = 35;
		
		G<Integer, String> g3 = new G<Integer, String>();
		g3.s1 = 23;
		g3.s2 = "abc";
		
		G<Boolean, Boolean> g4 = new G<Boolean, Boolean>();
		g4.s1 = true;
		g4.s2 = false;

		g2.test1(23, 35);
		g3.test1(23, "xyz");
		g4.test1(true, false);
	}
}
//any number of generic can be specified (,) as a seperator
//the main goal is object to object if you want to change data type
//generic can not be static 
//static member static attribute static method argument static method return type these can not be generic