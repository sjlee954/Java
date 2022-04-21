
public class Ex04 {

	public static void main(String[] args) {
		//함수에서 입력(X), 출력(O)
		//int num = 2;
		//int num2 = 5;
		
		System.out.println("main() 함수!!");
		
		double n = sub();
		
		System.out.println("결과 값은: "+n);
	}
	public static double sub() {
		double dnum = 12.5;
		
		System.out.println("sub() 함수...");
		
		return dnum;
	}
}
