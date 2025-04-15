package app59;
class C {
	int i;
	C(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "i = " + i;
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(90);
		System.out.println(c1);
	}
}
//for override toString method through we specify which method override
//in order to print content or state of the object through it's reference variable'