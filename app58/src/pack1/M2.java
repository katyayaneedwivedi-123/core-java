package pack1;
class P {
	
}
class Q extends P {
	
}
class R extends Q {
	
}
class S extends R {
	
}
class T extends S {
	
}
class B < Z > {
	
}
public class M2 {
	public static void main(String[] args) {
		B < ? > b1 = null;
		b1 = new B<Integer>();
		b1 = new B<String>();
		b1 = new B< P >();
		b1 = new B< Q >();
		b1 = new B< R >();
		b1 = new B< S >();
		b1 = new B< T >();
		
		B < ? extends R> b2 = null;
//		b2 = new B< P >();
//		b2 = new B< Q >();
		b2 = new B< R >();
		b2 = new B< S >();
		b2 = new B< T >();
//		b2 = new B<Integer>();
//		b2 = new B<String>();
		
		B < ? super R> b3 = null;
		b3 = new B< P >();
		b3 = new B< Q >();
		b3 = new B< R >();
//		b3 = new B< S >();
//		b3 = new B< T >();
//		b3 = new B<Integer>();
//		b3 = new B<String>();
	}
}
//super is also take the Object