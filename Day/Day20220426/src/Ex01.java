
public class Ex01 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		c1.num++;
		System.out.println(c1.num);
		System.out.println(c2.num);
		System.out.println(c3.num);
		
		//싱글톤 객체생성은 하나만 됨.
		Car2 c10 = Car2.getInstance();
		c10.num++;
		System.out.println(c10.num);
		
		Car2 c11 = Car2.getInstance();
		c10.num++;
		System.out.println(c10.num);
	}
}
class Car {
	
	int num = 10;
	
	public Car() {
	}
}

class Car2 {
	private static Car2 car2 = null; //클래스변수 둥 떠있음.
	
	int num = 100; //인스턴스변수
	
	private Car2() {} //기본생성자
	
	public static Car2 getInstance() { //클래스메소드 :객체생성전에 메소드호출 가능
		if(car2 == null)
			car2 = new Car2();  //생성자 호출
		return car2; //c10 c11 로 값을 보냄 그래서 타입이 일치해야하기 때문에 c10 앞에 Car2를 붙임.
	}
		
	
}