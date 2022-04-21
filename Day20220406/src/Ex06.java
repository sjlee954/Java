import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("양수");
			System.out.println("정확합니다.");
		}
		else if (num < 0)                   //경우의 수가 세가지 이상일 경우 else if를 무한대로 쓸 수 있다.  
			System.out.println("음수");
			
		else                                //경우의 수가 두가지일 경우 else를 쓴다.
			System.out.println("영");
			
//		if (num == 0)
//			System.out.println("영");
//		
//		if (num < 0)
//			System.out.println("음수");
		
		sc.close();
	}

}
