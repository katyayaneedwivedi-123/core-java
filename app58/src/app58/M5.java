package app58;
class E < T > {
	T field;
}
public class M5 {

		public static void main(String[] args) {
			E<Integer> e1 = new E<Integer>();
			e1.field = 34;
			
			E<String> e2 = new E<String>();
			e2.field = "abc";
			
			E<Boolean> e3 = new E<Boolean>();
			e3.field = true;
			
		}
}
//T is a identity
// and field data type is T
//T is not a integer not a boolean etc. it is generic
//object to object data type is changing
//field data type is not a hard coded