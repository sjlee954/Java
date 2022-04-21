import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		boolean flag = true;
		
		Scanner scanner = new Scanner(System.in);

		 while (flag) { 
			
			System.out.print("사칙연산 기호를 입력하세요.(종료시 q)"); 
			String ch = scanner.nextLine();
			if ("q".equals(ch)) break;
			
			System.out.print("숫자를 입력하세요.(종료시 아무숫자)"); 
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if ("+".equals(ch)) {
				System.out.println("sum : "+(sum += num)); 
			} else if ("-".equals(ch)) {
				System.out.println("sum : "+(sum -= num)); 
			} else if ("*".equals(ch)) {
				
				System.out.println("sum : "+(sum *= num)); 
			} else if ("/".equals(ch)) {
				System.out.println("sum : "+(sum /= num)); 
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println();
		}
		
	
		System.out.println("총합계산: "+sum);
		scanner.close();
	}

}
