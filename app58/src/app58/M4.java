package app58;
class D {
	D(Boolean b1){
		
	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(true);
		D d2 = new D(false);
		
		D d3 = new D(true);
		D d4 = new D(false);
		
		D d5 = new D(true);
		D d6 = new D(false);
		
		System.out.println("done");
	}
}
//constructor argument datatype has been fixed
//this way of development is not advisable
//in the constructor argument datatype we have supply boolean is fixed so it non generic