package pack1;
class A2 <T>
{
	T s1;
	void push(){
		System.out.println("push" + s1);
	}
	void pop() {
		System.out.println("pop" + s1);
	}
	void peek() {
		System.out.println("peek" + s1);
	}
	void isEmpty() {
		
	}
}
public class M9b {
	public static void main(String[] args) {
		A2 <String> t1 = new A2 <>();
		t1.s1 = "abc";
		
		A2 <Integer> t2 = new A2 <>();
		t2.s1 = 213;
		
		t1.push();
		t2.push();
	}
}
