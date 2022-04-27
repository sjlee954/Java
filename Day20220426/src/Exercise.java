
class Exercise {
	public static void main(String[] args) {
		SutaCard card1 = new SutaCard(3, false);
		SutaCard card2 = new SutaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
class SutaCard {
	int num;
	boolean isKwang;
	char ch;
	
	public SutaCard(int num, boolean isKwang) {
		if (1 <= num && num <=10) 
			this.num = num;
		else 
			this.num = 0;
		
		this.isKwang = isKwang;
	}	
	public SutaCard() { 
//		this.num=1;
//		this.isKwang = true;
		this(1,true); //생성자 안에서 변수 두개를 만족하는 다른 
		              //생성자를 호출해옴.
	}
	
	String info() {
		return num+(isKwang? "K":"");
	}
}
