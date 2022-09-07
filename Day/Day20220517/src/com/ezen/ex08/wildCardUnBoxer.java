package com.ezen.ex08;

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
	public static void peekBox(Box<?> box) { //와일드카드 메소드 기반
		System.out.println(box);             //제네릭은 <T>생략 X, 와일드는 지금 생략된 상태.
	}

}

public class wildCardUnBoxer {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setOb(100);
		Unboxer.peekBox(box);
		
		
	}

}
