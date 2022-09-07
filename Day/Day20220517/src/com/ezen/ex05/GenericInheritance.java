package com.ezen.ex05;

class Box<T> {
	protected T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob = ob;}
}

class SteelBox<T> extends Box<T> {
	public SteelBox(T t) {ob = t;} //생성자 
	
}
public class GenericInheritance {

	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox<>(7959); //상위클래스가 하위클래스 참조는 가능하지만 인자값도 상속된 타입으로 넣어줘야 에러가 안남. 
		      //Integer타입으로 하위클래스를 참조했다면 Integer를 입력해야함 String넣으면 에러남.
//		Box<Integer> iBox = new SteelBox<>("simple); //타입불일치 에러. 
		Box<String> sBox = new SteelBox<>("simple");
		
		System.out.println(iBox.getOb());
		System.out.println(sBox.getOb());
		
		
	}
}
