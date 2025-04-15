class F
{
	public static void main(String[] args) 
	{
		int i = 35, j = 20;
		int min = (i < j) ? i : j;	//	formula not change
		System.out.println(i);//35
		System.out.println(j);//20
		System.out.println("min:" + min);//min:20
	}
}
