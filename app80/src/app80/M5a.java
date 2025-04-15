package app80;

class C {
	private int i, j, k;
	C(int i, int j, int k){
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}
	public int getK() {
		return k;
	}
	public int get() {
		return i + j + k;
	}
	public C setI(int i) {
		C obj = new C(i, j, k);
		return obj;
	}
	public C setJ(int j) {
		C obj = new C(i, j, k);
		return obj;
	}
	public C setK(int k) {
		C obj  = new C(i, j, k);
		return obj;
	}
	public C set(int i, int j, int k) {
		C obj = new C(i, j, k);
		return obj;
	}
	@Override
	public String toString() {
		return "address:" + super.toString() + "and state ==> i = " + i + ", j = " + j + ", k = " + k;
	}
}
public class M5a {
	public static void main(String[] args) {
		C c1 = new C(56, 67, 90);
		System.out.println(c1);
		C c2 = c1.setI(34);
		System.out.println(c2);
		C c3 = c1.setJ(454);
		System.out.println(c3);
		C c4 = c1.setK(78);
		System.out.println(c4);
	}
}
