
public class Ex01 {

	public static void main(String[] args) {
		Car c1= new Car(); 
		Car c2= new Car();
		Car c3= new Car();
		c1.num++; 
		System.out.println(c1.num);
		System.out.println(c2.num);
		System.out.println(c3.num);
		
//		Car c4 = new Car();
//		c4.func();
//		
//		Car c5 = new Car(c4);
		
//		System.out.println(c5.num);
		
		Car2 c10 = Car2.getInstance(); //타입이 Car2인 변수 c10에 
		                             //클래스 Car에 있는 getInstance함수 
		                             //호출해서 나온 반환값저장함. 어디에? 변수타입이 Car2인 변수 c10에
		c10.num++;
		System.out.println(c10.num);
		
		Car2 c11 = Car2.getInstance(); //객체를 따로 생성했지만 같은 클래스를 참조하고있음.
		c11.num++;                     //*이 부분이 약간 이해 부족.
		System.out.println(c11.num);   //같은 클래스를 참조하고 있기때문에 num값도 같이 올라감.
		System.out.println(c10.num);
	}
}
class Car {
	int num = 10; //객체 생성하고 나서 사용할 수 있는 인스턴스변수
	public Car() {
		System.out.println("car 생성자");
		
	} 
	
}
class Car2 { //디자인 패턴 >> 싱글톤 ; 객체를 하나만 생성해서 공유하겠다.
	
	private static Car2 car2 = null; //외부에서 변수 car2에 접근하는 것을 막기 위해서(임의로 값을 변경하는것을 막고자)
	                                 //private을 붙였지만 static이 붙음으로써 클래스변수로 객체생성전에 메모리공간에
	                                 //올라가기 때문에 getInstance메소드 내에서 Car2 car2 = null이라는 변수를 
	                                 //사용할수 있음. 그래서 객체생성도 가능!!
	
	int num = 100;
	
	private Car2() { //디폴트 생성자
		System.out.println("car2 생성자");
	}
	public static Car2 getInstance() {
		if(car2 == null)
			car2 = new Car2(); //생성자호출
		return car2; //생성자가 호출된 car2를 반환함 어디로? -->13번쨰줄에 있는 Car2.getInstance() 이곳으로
	}
	
}

//1.일반적으로 객체생성은 생성자를 통해서 객체생성한다.
//2.싱글톤은 생성자 private >> 외부접근 금지.
//3.어떻게 접근할 것인가? ==> getInstance메소드에서 객체를 생성하고 있다.
//4.외부에서 객체를 생성하려면 getInstance통해서만 가능하다.
//5.getInstance도 메소드이기 떄문에 외부에서 접근하려면 객체를 생성하고 접근해야한다.
//6.static메소드는 객체를 생성하지 않고서도 접근 가능하다. 따라서 getInstancefmf static메소드로 변경한다.
//7.getInstance static 메소드에서 객체를 생성해서 참조변수 car2에게 생정된 객체 주소값을 넘겨준다. 
//8.Car2 car2이 아이는 어떻게 설정해야 하는가? ==>static으로 static변수로 설정












