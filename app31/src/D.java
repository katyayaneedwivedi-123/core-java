class D
{
	public static void main(String[] args) 
	{
		int[] array;	//	declaration
		array = new int[5];	//definition
		System.out.println(array[0]);
		System.out.println(array[1]);
		array[0] = 10;
		array[1] = 42;
		System.out.println(array[0]);
		System.out.println(array[1]);
	}
}