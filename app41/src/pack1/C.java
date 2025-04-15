package pack1;
class C 
{
	public static void main(String[] args) 
	{
		A a1 = new A(); 
		System.out.println(a1.x);//this x is default 
		System.out.println(a1.y);// this y is protected
		System.out.println(a1.z);//this z ia pulic
	}
}
// we can use in this in same package