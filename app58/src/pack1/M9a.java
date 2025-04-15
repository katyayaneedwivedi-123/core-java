package pack1;
class A1 < T, U >{
	T s1;
	U s2;
	void pair(T arg1, U arg2) {
		System.out.println(arg1 + ", " + arg2);
	};
}
public class M9a {
	public static void main(String[] args) {
		A1<String, Integer> a1 = new A1<String, Integer>();
		a1.s1 = "katyayanee";
		a1.s2 = 21;
		a1.pair("katyayanee", 21);
		
		A1<Double, Character> a2 = new A1<Double, Character>();
		a2.s1 = 10.9;
		a2.s2 = 'K';
		a2.pair(10.9, 'K');
	}
}
