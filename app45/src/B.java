class B 
{
	public static void main(String[] args) 
	{
		byte b1 = 100;
		int i = b1;//int i = (int) b1;
		System.out.println(i);
		System.out.println(b1);
		int j = (int) b1;
		System.out.println(j);
	}
}
/*
100
100
100
*/
//this type is very optional b/c int is already narrow than byte