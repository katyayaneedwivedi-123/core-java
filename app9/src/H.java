class H 
{
	public static void main(String[] args) 
	{
		System.out.println(45 >> 1);
		System.out.println(45 >> 2);
		System.out.println(45 >> 3);
		System.out.println(45 << 1);
		System.out.println(45 << 2);
		System.out.println(45 << 3);
	}
}
/*
	for right shiffit
	45			==>	101101
	45 >> 1		==>	 10110  ===> 22
	
	45			==>	101101
	45 >> 2		==>	  1011  ===> 11
	
	45			==>	101101
	45 >> 3		==>	   101  ===> 5
	
	for right shiffit
	45			==>	101101
	45 << 1		==>	1011010  ===> 90
	
	45			==>	101101
	45 << 2		==>	10110100  ===> 180
	
	45			==>	101101
	45 << 3		==>	101101000  ===> 360
*/