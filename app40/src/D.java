class A
{
	private int i;
}
class D
{
	public static void main(String[] args) 
	{
		A a1 = new A();// private member of A should be used in D so error
		System.out.println(a1.i);
	}
}
//compilation error
//private member we cann't used in another side it should be used in same class