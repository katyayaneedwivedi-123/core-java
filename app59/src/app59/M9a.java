package app59;
class G1 {
	String i;
	G1(String i) {
		this.i = i;
	}
	@Override
	public int hashCode() {
		String s1 = "abc";
		int hash = s1.hashCode();
		return hash;
	}
}
public class M9a {
	public static void main(String[] args) {
		G1 g1 = new G1("abc");
		System.out.println(g1.hashCode());
		G1 g2 = new G1("abc");
		System.out.println(g2.hashCode());
	}
}
