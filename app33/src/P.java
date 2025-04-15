class P 
{
	int i;
	public static void main(String[] args) 
	{
		P p1;//refrence variable declaration
		p1 = new P();//assigning the object to refrence variable
		System.out.println(p1.i);
		p1.i = 300;
		System.out.println(p1.i);
	}
}
