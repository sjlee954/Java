package com.ezen.ex03;

class Box<T extends Number>{ //T에 올 수 있는 대상은 Number이거나 Number를 상속한 객체만 가능.
//class Box<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
	public int toIntValue() {
		return ob.intValue(); //T타입에 어떤 타입이 올지 정해지지 않아서 오류가 난다.
		//하지만 Number를 상속받게 되면 가능해진다.
	}
}

class Person {}

public class BoundedBox {

	public static void main(String[] args) {
		
		Box<Long> aBox = new Box<>();
		aBox.set(new Long(100L));
		
		System.out.println(aBox.get());
		
	
	}

}
