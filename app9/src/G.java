class G 
{
	public static void main(String[] args) 
	{
		//these are a right shift operator
		System.out.println(456 >> 1);
		System.out.println(456 >> 2);
		System.out.println(456 >> 3);
		//these are a left shift operator
		System.out.println(456 << 1);
		System.out.println(456 << 2);
		System.out.println(456 << 3);
	}
}
/*
	for right side
	
	456			==>			111001000
	456 >> 1	==>			 11100100	=====>	228(for the >> 1 digit move right side)
	
	
	456			==>			111001000
	456 >> 2	==>			  1110010	=====>	114(>> 2 means 2 digit move right side)
	
	
	456			==>			111001000
	456 >> 3	==>			   111001	=====>	57(>> 3 means 3 digit move the right side)
	
	for  left side
	
	456			==>			111001000
	456 >> 1	==>		   1110010000	=====>	912(<< 1 means add 1 zero in right side)
	
	456			==>			111001000
	456 >> 1	==>		  11100100000	=====>	1824(<< 2 means add 2 zero in right side)
	
	456			==>			111001000
	456 >> 1	==>		 111001000000	=====>	3648(>> 3 means add 3 zero in right side)
*/