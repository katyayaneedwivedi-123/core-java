package app53;

public class W {
	Integer obj;
	W(){
		int i = obj;	// int i = obj.intValue();
	}
	public static void main(String[] args) {
		W obj = new W();
		System.out.println("done");
	}
}
//null point exception b/c we direct give the obj means
//derived the derived default value is null