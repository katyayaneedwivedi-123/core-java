package app59;
class I {
	int i;
	int j;
	
	I(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public int hashCode() {
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int hash = s1.hashCode();
		hash += s2.hashCode();
		return hash;
	}
}
public class M10 {
	public static void main(String[] args) {
		I obj1 = new I(90, 120);
		I obj2 = new I(90, 120);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		I obj3 = new I(190, 220);
		I obj4 = new I(190, 220);
		
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		
	}
}
