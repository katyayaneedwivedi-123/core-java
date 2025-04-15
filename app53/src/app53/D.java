package app53;

public class D {
	public static void main(String[] args) {
		Integer obj = 100;	// Integer obj = Integer.valueOf(100);
		
		// auto boxing
		int i = obj;	// int i = obj.intValue();//auto unboxing
		System.out.println("done");
	}
}

/*
Integer obj = 100;
int i = obj;
these are give error in jdk 1.4 or before b/c in this no autoboxing and
no autounboxing is available
*/