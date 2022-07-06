package com.ezen;

public class AnimalTest {

	public static void main(String[] args) {
		Animal an1 = new Animal();
		Animal an2 = new Mammal();
		Animal an3 = new Person(); 
		//상위클래스를 하위클래스에 참조하면 하위클래스에 접근할 수 있는 것은 상위클래스 범위내이다.
		
		an1.eat();
		an2.eat();
		an3.eat();
		an3.run();
		
		
//		Person p = an3;
//		Person p = (Person)an3; //참조변수를 형변환하면 참조하고있는 하위클래스의 모든 메서드를
		                        //접근할 수 있음.
		
//		p.eat();
//		p.run();
//		p.play();
//		
//		Mammal m1 = (Mammal)an3;
//		m1.eat(); //사람이먹는다가 출력됨.
//		
//		Object obj = new Person();
//		Person p2 = (Person)obj; //조상타입을 ->자손타입으로 형변환 생략불가.
//		p2.eat();
		
		Animal animal = new Penguin();
//		animal.eat();
//		animal.play();
//		Penguin Penguin = (Penguin)animal;
//		Penguin.play();
		
		if(animal instanceof Birds) {
			Birds birds = (Birds)animal; 
			//버드는 참새,펭귄을 다 참조할수 잇지만 참새는 참새만, 펭귄은 펭귄만 참조할 수 있기떄문에
			//버드로 형변환을 해주는 것이다.
		}
		else if (animal instanceof Mammal) {
			Mammal mammal = (Mammal)animal;
		}
			
//		Person pserson (Person)animal;
//		person.eat();
	}

}

class Animal extends Object { //상위클래스의 메서드를
	void eat() {              //오버라이딩하고있는 하위클래스 메서드만 접근 가능!
		System.out.println("동물이 먹는다.");
	}
	void run() {}
}
class Mammal extends Animal{
	void eat() {
		System.out.println("포유류가 먹는다.");
	}
	
}
class Whale extends Mammal {
	void eat() {
		System.out.println("고래가 먹는다.");
	}
	
}
class Person extends Mammal {
	void eat() {
		System.out.println("사람이 먹는다.");
	}
	void run() {
		System.out.println("사람이 달린다.");
	}
	void play() {}
}
class Birds extends Animal {
	void eat() {
		System.out.println("조류가 먹는다.");
	}
	
}
class Penguin extends Birds {
	void eat() {
		System.out.println("펭귄이 먹는다.");
	}
	void play() {System.out.println("펭귄이 논다.");}
}
class Sparrow extends Birds {
	void eat() {
		System.out.println("참새가 먹는다.");
	}
	
}