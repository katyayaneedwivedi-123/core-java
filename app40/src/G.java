class A
{
	private int i;
}
class G extends A
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
	}
}
//private member canot used even in sub class also
//compilation error
//inside G is subclass of A but we are not able to used this
//in sub class cannot inherit the private superclass