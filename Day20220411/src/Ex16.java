import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
	      String tmp;
	      String i;
	      int num = 0, sum = 0;
	      Scanner scanner = new Scanner(System.in);
	      Outer:
	      for (;;) {

	         System.out.println("(q) 나가기");
	         System.out.println("(+) 더하기");
	         System.out.println("(*) 곱하기");
	         System.out.println("(/) 나누기");
	         System.out.println("(-) 빼기");

	         tmp = scanner.nextLine();
	         char menu = tmp.charAt(0);
	         if (menu == 'q') {
	            System.out.println("프로그램을 종료합니다.");
	            System.out.println("totalsum = " + sum);
	            break Outer;
	         }

	         System.out.println("숫자를 입력하세요.");
	         i = scanner.nextLine();
	         num = Integer.parseInt(i);

	         switch (menu) {
	         case '+':
	            sum += num;
	            break;
	         case '*':
	            sum *= num;
	            break;
	         case '/':
	            sum /= num;
	            break;
	         case '-':
	            sum -= num;
	            break;
	         default:
	            System.out.println("잘못된 입력입니다.");
	            break;
	         }
	         System.out.println("\nsum =" + sum);

	      }

	}

}
