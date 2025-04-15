package app61;
class D {
	int i;
	
	void test() throws CloneNotSupportedException{
		//D d1 = clone();//it give compile time error
		D d1 = (D) clone();
	}
}
public class M4 {

}
//clone method return type is downcasted if it downcasting is required