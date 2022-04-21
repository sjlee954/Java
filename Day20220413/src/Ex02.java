import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2= sc.nextInt();
		
		add(num1,num2); //함수 호출

		System.out.println("프로그램 종료");
		
		sc.close();
	}
	// 1) 입력O, 출력X   void(반환형) add(함수이름)
	public static void add(int num1, int num2) {  // --->함수 정의, 함수 몸체

		System.out.println("두 수의 합은"+(num1+num2));
	}

}
