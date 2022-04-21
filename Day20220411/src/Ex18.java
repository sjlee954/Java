import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		int sum = 0;
		int num;
		
		boolean flag = true;
		
		Scanner scanner = new Scanner(System.in);

		 while (flag) { 
			
			System.out.print("사칙연산 기호를 입력하세요.(종료시 q)"); 
			String str = scanner.nextLine();
			char ch = str.charAt(0);
			
			System.out.print("숫자를 입력하세요.(종료시 숫자0"); 
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			switch (ch) {
				case '+' :
					sum += num;
					System.out.println("sum: "+(sum+=num));
					break;
				case '-' :
					sum -= num;
					System.out.println("sum: "+(sum-=num));
					break;
				case '*' :
					sum *= num;
					System.out.println("sum: "+(sum*=num));
					break;
				case '/' :
					sum /= num;
					System.out.println("sum: "+(sum/=num));
					break;
				case 'q' :
					flag = false;
					System.out.println("종료합니다.");
					
			}  //end of switch 
			System.out.println();
		}  //end of while
		
		System.out.println("총합계산: "+sum);
		scanner.close();
	}

}
