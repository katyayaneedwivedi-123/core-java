package app78;

public class M14 {
	public static void main(String[] args) {
		int i = 100;
		System.out.printf("%-020d", i);
	}
}
//it is a IllegalFormatFlagsException
//%-0number% this combination is not allow b/c - means 
//a line in left and 0 is for padding in the left side
