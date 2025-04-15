class A 
{
	private int i;//i is used in current class not be used in outside of class b/c it is private
	
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
	}
}
//private memeber cannot be used in outside of class and cannot be used in one class to another class
