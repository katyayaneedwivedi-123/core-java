package app59;

class D {
	int i;
	D(int i) {
		this.i = i;
	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(90);
		D d2 = new D(90);
//		System.out.println(d1 == d2);//if we use this line then it line give the false b/c it check the memory address 
		System.out.println(d1.i == d2.i);//if we use this line then it give then true b/c it check the value not the address of the memory
		System.out.println(d1.equals(d2));//it returning false b/c d1 and d2 both are different memory location
		D d3 = d1;
		System.out.println(d1 == d3);
		System.out.println(d1.equals(d3));//both use the same equals method also so it returning true
	}
}
//two different object data is same
//equals method also object class method
//d1 and d2 both are the memory address location are different so it getting false
//d1 and d3 both are the same memory so it true
//object class equals method is internally using equals operator