package pack2;
class TypeOfException extends ArithmeticException {
    TypeOfException (){
    	
    } 
	
	TypeOfException(String value) {
		System.out.println("value");
	}
	
}
public class K1 extends TypeOfException {
	public static void main(String[] args) {
			System.out.println("program started");
			int a = 21;
			if(a <= 0){
				throw new TypeOfException("pls enter above the 21 value");
			}
		System.out.println("program end");
	}
}
