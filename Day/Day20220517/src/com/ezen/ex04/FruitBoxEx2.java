package com.ezen.ex04;

import java.util.ArrayList;

import com.ezen.ex04.FruitBoxEx2.Eatable;

class Fruit implements Eatable {
	@Override
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Grape";}}
class Toy { public String toString() {return "Toy";}}
public class FruitBoxEx2 {

interface Eatable {}

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> fruitBox = new FruitBox<Apple>(); //에러. 타입불일치
//		FruitBox<Toy> fruitBox = new FruitBox<Toy>();  //에러.
	
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); //에러. Grape는 Apple의 자손이 아님
//		grapeBox.add(new Fruit()); //에러. 자손클래스는 상위클래스를 참조할 수 없음.
		grapeBox.add(new Grape());
		
		System.out.println(fruitBox.size());
		
		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item)  { list.add(item); }
	T get (int i)     { return list.get(i); }
	int size()        { return list.size(); }
	public String toString() { return list.toString();}
}
