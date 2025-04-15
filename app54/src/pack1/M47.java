package pack1;

public class M47 {
	public static void main(String[] args) {
		try {
			//some statements
		} 
		catch (ArithmeticException ex) {
			//some statements
			throw new ArithmeticException(ex.getMessage());
		}
	}
}
//inside the try throw is not recommended but syntactically allow
//but the inside the catch we can develop the throw
//handling the rising exception is called the rethrow
//means already exception is handle and again exception rise
//same exception rethrowing