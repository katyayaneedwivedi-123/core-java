package app60;
class B {
	
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B();//first object
		b1 = new B();//second object
		//first object is became abandoned it was pointing to first objectb1 pointing to second object
		//no one point a abandoned
		b1 = null;
		//in there second object is abandoned
	}
}
