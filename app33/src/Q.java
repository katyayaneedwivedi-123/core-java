class Q 
{
	int i;
	public static void main(String[] args) 
	{
		Q q1;//local variable can not be used without initialization
		System.out.println(q1.i);
		q1.i = 40;
		System.out.println(q1.i);
	}
}
//compilation error