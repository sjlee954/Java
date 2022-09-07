class Apple {
	@Override
			public String toString() {
				return "apple";
			}
}
class Orange {
	@Override
		public String toString() {
			return "orange";
		}
}
//class AppleBox { //사과만 담는 박스
//	private Apple ap;
//
//	public Apple getAp() {
//		return ap;
//	}
//
//	public void setAp(Apple ap) {
//		this.ap = ap;
//	}
//}
//
//class OrangeBox { //오렌지만 담는 박스
//	private Orange or;
//
//	public Orange getOr() {
//		return or;
//	}
//
//	public void setOr(Orange or) {
//		this.or = or;
//	}
//}
class Box { //담는기능을 하나로 합친 클래스
	private Object ob;

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}
	
	
}
public class FruitBoxEx1 {

	public static void main(String[] args) {
//		AppleBox aBox = new AppleBox();
//		OrangeBox oBox = new OrangeBox();
//		
//		aBox.setAp(new Apple());
//		oBox.setOr(new Orange());
//		
//		Apple ap = aBox.getAp();
//		System.out.println(ap);
//	
//		Orange or = oBox.getOr();
//		System.out.println(or);
		
		Box aBox = new Box(); 
		Box oBox = new Box(); 
		
		aBox.setOb(new Apple());
		oBox.setOb(new Orange());
		
		Apple ap = (Apple) aBox.getOb();
		System.out.println(ap);
		
		Orange or = (Orange) oBox.getOb();
		System.out.println(or);
		
		aBox.setOb("apple"); //이거
		oBox.setOb("orange");
		
//		Apple ap2  = (Apple) aBox.getOb(); //컴파일 에러
		System.out.println(aBox.getOb()); //집어넣은 문자열 자체가 나오게됨.
		
		
	}

}


