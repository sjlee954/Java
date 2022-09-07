package com.ezen.ex12;

class Box<T> {
	private T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob = ob;}
	 
	@Override
	public String toString() {return ob.toString();}
}

class Toy {
	@Override
	public String toString() {
		return "I am Toy";
	}
}
class Robot extends Toy {
	@Override
	public String toString() {
		return "I am Robot";
	}
}
class BoxHandler {                                      //Box전달 대상은 Toy, Robot 가능.
	public static void outBox(Box<? extends Toy> box) { //Toy 또는 Toy를 상속받은 인스턴스만 가능.
		Toy t = box.getOb();                            //main에서 전달한 Box는 Toy타입만 받고 있어
		System.out.println(t);                          //Robot타입도 받으려면 와일드카드써야함 <? extends Toy>
//		box.setOb(t);                                   //set불가 get만 가능
	}
	public static void inBox(Box<? super Toy> box, Toy t) { //box전달 대상은 Toy, Objrct
		box.setOb(t);
		
//		t = box.getOb() 박스로 오브젝트를 받게 되면 box.getOb()는 타입이 오브젝트다. 토이가 참조할 수 없다.
	}
}
public class BoundedWildCardBase {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
		
		
	}
}
