class A
{
}
class B
{
}
class P extends A, B 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//java not supporting multiple inheritance through superclasses
//multiple superclasses not allow for the same sub class
//compilation error
//but this type inheritance support c++