package app72;

import java.util.HashMap;
import java.util.HashSet;

class D{
	int i, j, k;
	D(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ", " + k + ")";
	}
	@Override
	public int hashCode() {
		int hash = Integer.toString(i).hashCode();
		 hash += Integer.toString(j).hashCode();
		 hash += Integer.toString(k).hashCode();
		 System.out.println("hashNo for" + this + ":" + hash);
		 return hash;
	}
	@Override
	public boolean equals(Object obj) {
		boolean flag = (obj instanceof D) &&
				(i == ((D)obj).i)&&
				(j == ((D)obj).j)&&
				(k == ((D)obj).k);
		System.out.println("euals b/w " + this + " and " + obj + " is " + flag);
		return flag;
	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(10, 20, 30);
		D d2 = new D(10, 20, 30);
		D d3 = new D(10, 20, 30);
		D d4 = new D(20, 10, 30);
		D d5 = new D(20, 10, 30);
		D d6 = new D(30, 20, 10);
		D d7 = new D(30, 20, 10);
		D d8 = new D(400, 200, 300);
		D d9 = new D(400, 200, 300);
		D d10 = new D(200, 400, 300);
		D d11 = new D(200, 300, 400);
		D d12 = new D(200, 300, 400);
		D d13 = new D(50, 20, 30);
		D d14 = new D(1000, 5, 4);
		HashSet<D> set = new HashSet<D>();
		System.out.println("adding d1:" + set.add(d1));
		System.out.println("-------------------");
		System.out.println("adding d2:" + set.add(d2));
		System.out.println("-------------------");
		System.out.println("adding d3:" + set.add(d3));
		System.out.println("------------------");
		System.out.println("adding d4:" + set.add(d4));
		System.out.println("------------------");
		System.out.println("adding d5:" + set.add(d5));
		System.out.println("-------------------");
		System.out.println("adding d6:" + set.add(d6));
		System.out.println("-------------------");
		System.out.println("adding d7:" + set.add(d7));
		System.out.println("-------------------");
		System.out.println("adding d8:" + set.add(d8));
		System.out.println("-------------------");
		System.out.println("adding d9:" + set.add(d9));
		System.out.println("-------------------");
		System.out.println("adding d10:" + set.add(d10));
		System.out.println("-------------------");
		System.out.println("adding d11:" + set.add(d11));
		System.out.println("-------------------");
		System.out.println("adding d12:" + set.add(d12));
		System.out.println("-------------------");
		System.out.println("adding d13:" + set.add(d13));
		System.out.println("-------------------");
		System.out.println("adding d14:" + set.add(d14));
		System.out.println("-------------------");
		
		
	}
}
//if multiple object have the same hash code then we store in the same bucket
//like d1 object call the hashCode then it give hash value and this hash value store in the bucket
//if any object value is same whether the hash value is same and store in the same bucket but we are not add the value b/c this is duplicate
//if the object value is not same whether the hash code same and they store in same bucket the value is adding the element b/c is not duplicate
//hash code confirm inequality means if the 2 object have the different hash code then it not store in the same bucket
//and also not required the calling methods
//b/c calling equals method is very expensive in with respect to time