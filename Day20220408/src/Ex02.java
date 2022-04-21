import java.util.Scanner;

public class Ex02 { //p.150 4-7예제를 if문으로 풀어쓴 것.

	public static void main(String[] args) {
		System.out.print("가위(1),바위(2),보(3)중 하나를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random()*3)+1;
		
		System.out.println("당신은"+user+"입니다.");
		System.out.println("컴은"+com+"입니다.");
		
		if(user-com==0) {
			System.out.println("비겼습니다.");
		} else if(user-com==2 || user-com==-1) {
			System.out.println("당신은 졌습니다.");
		} else
			System.out.println("당신은 이겼습니다.");

		scanner.close();
	}

}
