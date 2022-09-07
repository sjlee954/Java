
public class Abstract {

	public static void main(String[] args) {
//		Product pro = new Product(10);
//		System.out.println(pro.price);
	
		Product pro = new Computer();
		System.out.println(pro.price);
		pro.test();
		pro.func();
	}

}

abstract class Product {
	int price; //제품의 가격
	Product(int price) {
		this.price = price;
	}
	void test() {
		System.out.println("Product");
	}
	abstract void func(); //추상메서드 
}

class Tvv extends Product {
	Tvv() {super(100); } //티비가격
	
	public String toString() { return "Tv"; } // 가격과 "Tv"를 가지고 있음.
	                                          // 	System.out.println(p.price); = 100 
	                                          //	System.out.println(p.toString()); = Tv

	@Override
	void func() {
		// TODO Auto-generated method stub
		System.out.println("tv");
		
	}
}
class Computer extends Product {
	Computer() {super(200); } //컴퓨터가격
	
	public String toString() { return "Computer"; }

	@Override
	void func() {
		System.out.println("comouter");
	}
	
}
class Audio extends Product {
	Audio() {super(50); }

	public String toString() { return "Audio"; }

	@Override
	void func() {
		// TODO Auto-generated method stub
		System.out.println("audio");
		
	}
}