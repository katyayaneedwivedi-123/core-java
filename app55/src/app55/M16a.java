package app55;
class H{
	void test1() {
		System.out.println("test1");
	}
	void test2() {
		System.out.println("test2");
	}
}
public class M16a {
	public static void main(String[] args) {
		H h = new H() {
			void test1() {
				System.out.println("new test1");
			}
			void test2() {
				System.out.println("new test2");
			}
		};
		h.test1();
		h.test2();
	}
}
