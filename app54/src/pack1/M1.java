package pack1;

public class M1 {
	public static void main(String[] args) {
		int i = 10 / 0;
		
		int j = Integer.parseInt("abc");
		
		int[] elements = {10, 20};
		int k = elements[10];
		
		main(null);
	}
}
//it is unchecked b/c it have runtime exception 
//so it have need of try and catch but it is unchecked so it compile 
//so it compile successfully
//but not run