import java.util.Scanner;

public class Ex04 { //숫자 5개를 순차적으로 입력해서 다 더한 값 

	public static void main(String[] args) {
		int sum = 0; //누적용
		int i = 0; //회전용도
		int input;
		
		Scanner scanner = new Scanner(System.in);
		
		while(i++ < 5) {
			System.out.println(i+"회 정수 입력: ");
			input = scanner.nextInt();
			
			sum +=input;
			System.out.println("sum: "+sum);
		}

		scanner.close();
	}

}
