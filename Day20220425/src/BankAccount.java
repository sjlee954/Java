
public class BankAccount {//클래스 --> 클래스 설계는 추상화개념
	private int balance; //잔액 멤버변수,인스턴스변수, 원칙 : 변수는 외부에서 직접 접근을 금지
	                                     //정보은닉 목적 중 하나가 무결성
	private int sum; //변수명 첫글자만 대문자로 바꿔서 붙임 8번줄
	
	//getter, setter ==> get 값 출력, set 갑 입력
//	public int getSum() {
//		return sum;
//	}
//	public void setSum(int sum) {
//		this.sum = sum;
//	}
	
	int deposit(int amount) { //입금
		balance += amount;
		return balance;
		
	}
	int withdraw(int amount) { //출금
		 balance -= amount;
		 return balance;
		 
	}
	
	void checkBanance() { //잔고 확인
		System.out.println("잔액 : "+balance);
	}
	
}

class MainClass {
	public static void main(String[] args) {
		//아래 화면처럼 출력하기 위한 문장을 기술
		//System.out.println(); -->문장사용 금지
		BankAccount kim = new BankAccount(); //생성자 호출 --> 현재는 디폴트 생성자호출됨.
		kim.deposit(10000);
		kim.checkBanance();
		kim.withdraw(3000);
		kim.checkBanance();

		BankAccount park = new BankAccount(); 
		park.deposit(50000);
		park.withdraw(30000);
		park.checkBanance();
		
		BankAccount lee = new BankAccount(); 
		lee.deposit(50000);
		lee.withdraw(49000);
		lee.checkBanance();
		
//		lee.setSum(100);
//		lee.getSum();
		
	}
}

//잔액 10000
//잔액 7000