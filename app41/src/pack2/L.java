package pack2;
import pack1.A;
class L extends A
{
	public static void main(String[] args) 
	{
		A a1 = new A();// calling satatement not inheritance b/c we are use A not L
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(a1.z);
	}
}
//compilation error
// we are using A(x and y) not allow in another package