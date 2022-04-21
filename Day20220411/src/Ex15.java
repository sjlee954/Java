import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
	      String input, ch;
	      
	      Scanner scanner = new Scanner(System.in);
	      
	      while(true) {
	         System.out.print("연산 기호 입력.(종료하고 싶다면 q) --> ");
	         input = scanner.nextLine();
	         ch = input;
	         
	         if(ch.equals("q")) {
	              System.out.println("종료합니다.");
	              System.out.println("총합 : " + sum);
	              break;
	           }
	         
	         System.out.print("숫자 입력. -> ");
	         input = scanner.nextLine();
	         num = Integer.parseInt(input);
	         
	         if(ch.equals("+")) {
	            System.out.printf("%d + %d = %d%n", sum, num, sum+num);
	            sum += num;
	         }
	         
	         if(ch.equals("-")) {
	            System.out.printf("%d - %d = %d%n", sum, num, sum-num);
	            sum -= num;
	         }

	           if(ch.equals("*")) {
	              System.out.printf("%d * %d = %d%n", sum, num, sum*num);
	              sum *= num;
	           }

	           if(ch.equals("/")) {
	              System.out.printf("%d / %d = %d%n", sum, num, sum/num);
	              sum /= num;
	           }
	           
	      
	      }


	}

}
