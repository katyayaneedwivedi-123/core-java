package app55;

class B{
	B(){
		System.out.println("B()");
	}
	
	B(int i){
		System.out.println("B(int)");
	}
	
	void test() {
		System.out.println("B-test");
	}
	
	{
		System.out.println("B-IIB");
	}
}
public class M9 {
	public static void main(String[] args) {
		B b1 = new B() {
			void test() {
				System.out.println("B-AIC-begin");
				super.test();
				System.out.println("B-AIC-end");
			}
			
			{
				System.out.println("AIC-IIB");
			}
		};
		b1.test();
		System.out.println("------");
		
		B b2 = new B(10) {
			void test() {
				System.out.println("B-AIC-begin");
				super.test();
				System.out.println("B-AIC-end");
			}
			
			{
				System.out.println("AIC-IIB");
			}
		};
		b2.test();
		System.out.println("------");
		
	}
}
