package pack2;
class Test
{
	public static void main(String[] args) 
	{
		M m1 = new M();
		System.out.println(m1.y);//protectedd used in current package not in another package
		System.out.println(m1.z);
	}
}
//compilation error
//b/c y should be used within the same class can not be used out side
// it is only usses so it not run