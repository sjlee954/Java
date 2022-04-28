
public class Exercise7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new NewTv());
		b.buy(new Computer());
		b.buy(new NewTv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
		}
	
	}


class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; //구입한 제품을 저장하기 위한 배열
	int i = 0;  //Product배열 cart에 사용될 index
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 "+p+"을 살 수 없습니다.");
			return;               //가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면
		}                         //메서드를 종료한다.
		money -= p.price;         //가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고 
		add(p);                   //장바구니에 구입한 물건을 담는다.
	}
	void add(Product p) { //저장된 물건을 장바구니(cart)에 담는 메서드
		if(i <= cart.length) {
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i++]=p; // 이 부분 잘 모르겠음...
	}
	void summary() {
		String itemList = "";
		int sum = 0;
		for(int i =0; i<cart.length;i++) {
			if(cart[i]==null)
				break;
			itemList = cart[i]+",";
			sum += cart[i].price;
		}
		System.out.println("구입한 물건 :"+itemList);
		System.out.println("사용한 금액 :"+sum);
		System.out.println("남은 금액 :"+money);
	}
}
class Product {
	int price; // 제품의 가격
	Product(int price) {
		this.price = price;
	}
}
class NewTv extends Product {
	NewTv() { super(100); }
	public String toString() { return "Tv"; } //toString 메서드는 Object클래스에 속해있는 메서드이다.
	                                          //기능으로는 객체의 문자정보를 Console창에 출력하는 기능을 가지고 있다.
	}
class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer";}
}
class Audio extends Product {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}

