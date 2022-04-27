package com.ezen;

import lombok.Getter;
import lombok.Setter;


public class CarTest {

	public static void main(String[] args) {
		Sedan se = new Sedan();
//		se.setColor("Red");
//		System.out.println(se.getColor());
//		se.setPassenger(4);
//		System.out.println(se.getPassenger()+"명");
		
		Sedan se2 = new Sedan("blue",2,4,3);
		
		SportsCar sp = new SportsCar();
//		sp.setColor("red")
//		System.out.println(sp.getColor);
		
		SportsCar sp2 = new SportsCar("yellow",2,4,1,5000);
		sp2.run();
		
		System.out.println(sp2.getColor()+","+sp2.getPassenger()+","+sp2.getTire()+","+
		                   sp2.getSeat()+","+sp2.horsepower); //찍으려면 getter사용할 수 밖에 없다.
	
		SportsCar sp3 = new SportsCar();
	}

}

@Getter
@Setter

class Car {
	
	private int passenger;
	private int tire;
	private int seat;
	
	void run() {
		System.out.println("달려!!!");
	}
	void stop() {}
	
	
	
	public Car() {
		System.out.println("Car()생성자");
	}
	public Car(int passenger,int tire, int seat) {
		System.out.println("Car()생성자");
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
	}
	
	
}
class Sedan extends Car { 
	private String color;
	
	public Sedan() {
		System.out.println("Sedan()생성자");

	}
	public Sedan(String color,int passenger, int tire, int seat) {
		super(passenger,tire,seat);
		System.out.println("Sedan()생성자");
		this.color = color;
	}

	void gas() {}
	public String getColor() {
		return color;
	}
//	public void setColor(String color) {
//		this.color = color;
//	}
}

class SportsCar extends Sedan {
	int horsepower;
	
	public SportsCar() {
		System.out.println("Sports()생성자");

	}
	
	public SportsCar(String color,int passenger, int tire, int seat,int horsepower) {
		super(color,passenger,tire,seat);
		this.horsepower = horsepower;
	}
	void run() { //오버라이딩
		System.out.println("스포츠카 달려!!!"); //지역변수와 인스턴스변수가 있을때 지역변수가 우선
	}
}

class Bus extends Car {
	int passengerCount;
	void passengerLoad() {}
}

class Truck extends Car {
	int load;
	void ObjectLoad() {}
}