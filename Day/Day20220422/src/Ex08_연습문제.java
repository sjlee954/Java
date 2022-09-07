import java.util.Scanner;

public class Ex08_연습문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = (int)(Math.random()*100)+1;
		int answer = 0;
		int count=0;
			
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요>>");
			answer = sc.nextInt();
			
			
			if (answer > num) { 
				System.out.println("더 작은 수를 입력하세요.");
				}else if (answer < num) {
					System.out.println("더 큰 수를 입력하세요.");
				}else {
					System.out.println("맞췄습니다.");
					System.out.println("시도횟수는 "+count+"번입니다.");
				}
			
		}while (true);
		
		
	}

}
