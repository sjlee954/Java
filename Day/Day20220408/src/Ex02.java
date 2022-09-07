import java.util.Scanner;

public class Ex02 { //p150 예제 if문으로 바꾼거 내가한거 틀린거

	public static void main(String[] args) {
		System.out.print("가위(1),바위(2),보(3)중 하나를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt(); 
		int com = (int)(Math.random() *3) + 1;  //어떻게 동작을 하는건지
                       //0과1사이의 난수가 발생
		
		System.out.println("당신은" + user + "입니다.");
		System.out.println("컴은" + com + "입니다.");
		
		if(user-com==0) {
			System.out.println("비겼습니다.");
		} else if (user-com<0) {
			System.out.println("당신이 졌습니다.");
		} else { 
			System.out.println("당신이 이겼습니다.");
		}
		
		scanner.close();
	}

}
