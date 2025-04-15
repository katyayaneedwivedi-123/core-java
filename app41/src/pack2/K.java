package pack2;
import pack1.A;
class K
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		//System.out.println(a1.x);// we can not use default and protecter outside of package
		//System.out.println(a1.y);
		System.out.println(a1.z);
	}
}
//compilation error