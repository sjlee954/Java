class Apple2 {
	@Override
			public String toString() {
				return "apple";
			}
}
class Orange2 {
	@Override
		public String toString() {
			return "orange";
		}
}
//<A>도 가능
class Box2<T> { //담는기능을 하나로 합친 클래스
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

public class FruitBoxEx2 {
	//제네릭스.
	//1.입력할때 타입 체크
	//2.출력할 때 형변환 생략가능
	
	public static void main(String[] args) {
		Box2<Apple2> aBox = new Box2<Apple2>(); 
		Box2<Orange2> oBox = new Box2<Orange2>();
		
		aBox.setOb(new Apple2());
		oBox.setOb(new Orange2());
		
		Apple2 ap = aBox.getOb();
		Orange2 or = oBox.getOb();
		System.out.println(ap);
		System.out.println(or);
		
//		aBox.setOb("new Apple()"); //이제는 입력도 제어가능. 타입이 문제가 되지 않아서 들어갈 수 있음.
	}

}


