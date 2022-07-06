package com.ezen.ex10;

class Box<T> {
	private T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob = ob;}
	 
	@Override
	public String toString() {return ob.toString();}
}

class Unboxer {
	public static void peekBox(Box<? super Integer> box) { //와일드카드 하한제한
		System.out.println(box);                        //Integer, Number, Object가능
	}
}

public class LowerBoundedWildCard {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setOb(123); 
		Unboxer.peekBox(box); 
		
		Box<Number> box2 = new Box<>();
		box2.setOb(12.3); 
		Unboxer.peekBox(box2); 

		Box<Object> box3 = new Box<>();
		box3.setOb("string"); 
		Unboxer.peekBox(box3); 
	}
}
