class E 
{
	public static void main(String[] args) 
	{
		final int[] array = new int[5];
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println("---------");
		array[0] = 40;
		array[1] = 140;
		array[2] = 401;
		array[3] = 301;
		array[4] = 404;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
	}
}
//compile successfully 