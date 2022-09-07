package com.ezen;

public class Exercise7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer(); //바이어 객체 생성
		//Product p = new Tvv();
		
		b.buy(new Tvv());      //바이어의 buy메서드 호출 인자값으로 Tv객체를 넣어줌. tv객체가 참조하고있는 클래스는 tv(본인)+product(조상)
		b.buy(new Computer());
		b.buy(new Tvv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();
	
	}

}
class Buyer {
	int money = 1000; //가지고있는 돈 
	Product[] cart = new Product[3]; //3개공간이 있는 장바구니 배열 
	int i = 0; //cart에 쓰이는 index i변수 선언.
	
	void buy(Product p) { //buy메서드
		if(money < p.price) {
			System.out.println("잔액이 부족하여"+p+"을 살 수 없습니다.");
			return; //메서드 종료.
		}
		money -= p.price; //가지고 있는 돈이 제품가격보다 많으면 가지고있는 돈에서 제품가격을 빼줌.
		add(p); //제품을 cart안에 넣는 add()메서드 호출.
	}
	void add(Product p) {
		if(i >= cart.length ) {  //제품 개수가 장바구니 공간보다 같거나 크면 장바구니공간을 두배로 늘린 후 담는다.
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i]=p; //첫번째 Tv와 Computer를 담을 때는 if문 실행안되고 여기먼저 실행됨.
		           //물건을 장바구니 (cart)에 저장한다. 
		i++;       //그리고 i의 값을 1증가시킨다.
	}
	void summary() {
		String itemList  = "";
		int sum = 0;
		for(int i = 0; i<cart.length;i++) {
			if(cart[i]==null)
				break;
			itemList += cart[i] + ",";
			sum += cart[i].price;
		}
		
		System.out.println("구입한 물건 :"+itemList);
		System.out.println("사용한 금액 :"+sum);
		System.out.println("남은 금액 :"+money);
	}
}

class Product {
	int price; //제품의 가격
	
	Product(int price) {
		this.price = price;
	}
}
class Tvv extends Product {
	Tvv() {super(100); } //티비가격
	
	public String toString() { return "Tv"; } // 가격과 "Tv"를 가지고 있음.
	                                          // 	System.out.println(p.price); = 100 
	                                          //	System.out.println(p.toString()); = Tv
}
class Computer extends Product {
	Computer() {super(200); } //컴퓨터가격
	
	public String toString() { return "Computer"; }
	
}
class Audio extends Product {
	Audio() {super(50); }

	public String toString() { return "Audio"; }
}













