import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 키보드로 두 점수 입력을 받아서 , 총점과 평균을 출력한다.
	
		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextIn();   정수밖에 입력못함. 문자 X
//		int num1 = sc.nextIn();

		String n1 = sc.nextLine();   //문자도 입력가능
		String n2 = sc.nextLine();
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		int sum = num1 + num2;
		double aver = sum / 2.0;
		
		System.out.println("합계:"+ sum + "평균:"+ aver);
		
		sc.close();
	
	}

}

