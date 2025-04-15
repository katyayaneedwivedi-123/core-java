class F 
{
	public static void main(String[] args) 
	{
		final int[] array = new int[10];
		array = new int[10];
		System.out.println("done");
	}
}
//compilation error
//we can not reassign the index number
//eventhough the index number are same we cann't initialized