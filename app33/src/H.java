class H 
{
	int i;
	
	public static void main(String[] args) 
	{
		H ref = new H();//ref is identifier(refrence variable)
		System.out.println(ref.i);
		ref.i = 30;
		System.out.println(ref.i);
	}
}
/*
0
30
*/