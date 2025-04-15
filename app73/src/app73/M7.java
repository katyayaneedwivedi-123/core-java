package app73;

import java.util.ArrayList;
import java.util.List;

class G{
	   int i, j, k;
	  G(int i, int j, int k){
	    this.i = i;
	    this.j = j;
	    this.k = k;
	}
	@Override
	public String toString() {
		return "("+ i +" , "+ j +"," + k + ")";
	  }

	}
public class M7 {
	public static void main(String[] args) {
		List<G> list = new ArrayList<G>();
		list.add(new G(10 , 20, 222));
		list.add(new G(1 , 200, 203));
		list.add(new G(101 , 2, 455));
		list.add(new G(510 , 205, 741));
		list.add(new G(160 , 620, 1));
		list.add(new G(109 , 290, 23));
		System.out.println(list);
		
		list.sort((o1 , o2) -> o1.i - o2.i);
		System.out.println(list);
		list.sort((o1 , o2) -> o1.j - o2.j);
		System.out.println(list);
		list.sort((o1 , o2) -> o1.k - o2.k);
		System.out.println(list);
	}	
}