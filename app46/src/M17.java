class M17 
{
	public static void main(String[] args) 
	{
		A a1 = new B();
		B b1 = (B) a1;//we are able to downcast
		System.out.println("----------------------");
		A a2 = new A();
		B b2 = (B) a2;//it not able to downcast
		System.out.println("----------------------");
	}
}
//it compile but in runing it give exception
//it is abnormal condition statement
//a1 containing B
//B object containing i,j,test1,test2
//A object is only containing a i and test