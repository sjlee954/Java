
public class CarTest {

	public static void main(String[] args) {
		Sedan se = new Sedan(5,4,"white");
//		se.color = "white";
//		se.passenger = 5;
//		se.tire = 4;
		System.out.println(se.color+","+se.passenger+","+se.tire);
		
		Bus b  = new Bus();
		b.passenger = 15;
		b.tire = 6;
		System.out.println(b.passenger+","+b.tire);
		
	
		Sports ss = new Sports(2,4,2,"Red",10000);
		System.out.println(ss.color + ","+ss.passenger + ","+ss.tire + ","+ss.seat+","+ss.sports);
	
	}

}


class Car3 { //차상위클래스 
	int passenger;
	int tire;
	int seat;
	public Car3(int passenger, int tire, int seat) {
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
		System.out.println("Car() 생성자");
	}
	public Car3() {} //디폴트생성자
	
	void run() {}
	void stop() {}
}

class Sedan extends Car3 { //클래스 Car3를 상속받은 클래스 Sedan.
	String color;
	public Sedan() {} //세단의 디폴트생성자
	public Sedan(int passenger, int tire,String color) {
		super(passenger,tire,4); //super : 자식클래스에서 상속받은 부모클래스의 멤버변수를 생성할때 사용.
								 //상위클래스 생성자 호출 , 첫번째 줄에 있어야함.
		this.color = color;        
//		this.passenger = passenger;
//		this.tire = tire;
		System.out.println("Sedan()생성자");
		}
	public Sedan(int passenger, int tire, int seat, String color) {
		super(passenger,tire,seat);
		this.color = color;
	}
}

class Sports extends Sedan {
	
	int sports; 
	public Sports() {} //디폴트생성자
	
	public Sports(int passenger, int tire, int seat,String color,int sports) {
		super(passenger,tire,seat,color);
		this.sports = sports;
	}

}
class Bus extends Car3 { 
	void paseengerLoad() {}
}

class Truck extends Car3 {
	void objectLoad() {}
	
}

