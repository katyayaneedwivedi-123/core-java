package pack2;
import pack1.A;
class M extends A
{
	public static void main(String[] args) 
	{
		M m1 = new M();
		//System.out.println(m1.x);//default inherit only current pacakge
		System.out.println(m1.y);
		System.out.println(m1.z);
	}
}
// compilation error
// X is default scope
