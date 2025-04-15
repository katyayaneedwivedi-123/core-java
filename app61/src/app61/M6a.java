package app61;
class F implements Cloneable {
	int i;
	
	F developDuplicate() throws CloneNotSupportedException {
		return (F) clone();
	}
}
public class M6a {
	public static void main(String[] args) throws CloneNotSupportedException{
		F f1 = new F();
		f1.i = 10;
		System.out.println(f1.i);
		
		F f2 = f1.developDuplicate();
		System.out.println(f2.i);
		f1.i = 2000;
		System.out.println(f1.i);
		System.out.println(f2.i);
	}
}
//changing is one not reflecting to another
//means changing in f1 is not reflecting to f2 and f2 not reflecting to f1
//both are independent both are disjoint
//this type of duplicate is called a deep copy operation