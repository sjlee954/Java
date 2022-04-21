
public class Ex02 {

	public static void main(String[] args) {
		//함수에서 입력(O), 출력(X)
		int num =2;
		int num2 =5;
		
		System.out.println("main() 함수");
		
		sub(num,num2);
		
		System.out.println("main()2 함수");
		
	}
	
	public static void sub(int num,int num2) {
		System.out.println("두 수의 합은: "+(num + num2));
	}

}
