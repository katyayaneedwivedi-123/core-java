class D 
{
	public static void main(String[] args) 
	{
		final int[] array = {10, 20, 30};
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println("---------");
		array[0] = 40;
		array[1] = 140;
		array[2] = 401;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
	}
}
//index vlaue and index locations are not final
//we can change the index value
//final is a reference variable but the index value
//we can modify the index value but not a index number
