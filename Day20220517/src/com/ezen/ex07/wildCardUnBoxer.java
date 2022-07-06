package com.ezen.ex07;

class Box<T> {
	private T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob = ob;}
	 
	@Override
	public String toString() {return ob.toString();}

}
class Unboxer {
	public static <T> T openbox(Box<T> box) { 
		return box.getOb();
	}
	public static <T> void peekBox(Box<T> box) { //제네릭 메소드 기반
		System.out.println(box);
	}

}

public class wildCardUnBoxer {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setOb("apple");
		
		Unboxer.peekBox(box);
		
		
	}

}
