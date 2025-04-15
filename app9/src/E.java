class E 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(125));
		System.out.println(Integer.toBinaryString(456));
		System.out.println(125 | 456);	//	bitwise or
		System.out.println(125 & 456);	//	bitwise and
		System.out.println(125 ^ 456);	//	bitwise xor
	}
}

/*
	125	==>	001111101(don't add right side zero it effect to the digit) 
	456	==>	111001000
	------------------
		==>	111111101(logical or)	==>	509
		
		
	125	==>	001111101
	456	==>	111001000
	-------------------
		==>	001001000(logical and)	==>	72
		
	
	125	==>	001111101
	456	==>	111001000
	-------------------
		==>	110110101(logical xor)	==>	537

*/