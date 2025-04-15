package app59;
class G {
	int i;
	G(int i){
		this.i = i;
	}
}//in this code we are not override  
public class M7 {
	public static void main(String[] args) {
		G g1 = new G(90);
		System.out.println(g1.hashCode());
		G g2 = new G(90);
		System.out.println(g2.hashCode());
		G g3 = new G(90);
		System.out.println(g3.hashCode());
		
	}
}
//hashcode method representing integer of memory address
//eventhough the object is saving same value it represent the memory address different
//b/c the hashcode method is not override 
//g1 g2 g3 g4 is pointing the different object content is same but it have the different hashcode