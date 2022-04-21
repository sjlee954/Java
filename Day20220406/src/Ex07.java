import java.util.Scanner;

public class Ex07 { //정수 입력받아서 -> 90이상 A, 80이상 B, 70C, 60D, 60이하F.

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String score = scanner.nextLine();
		
		int num = Integer.parseInt(score);
		
		if(num >=90 && num <=100)
			System.out.println("A학점입니다.");
		
		else if (num >= 80 && num <90)
			System.out.println("B학점입니다.");
		
		else if (num >= 70 && num < 80)
			System.out.println("C학점입니다.");
		
		else if (num >= 60 && num < 70)
			System.out.println("D학점입니다.");
		
		else if (num <= 50 && num >= 0)
			System.out.println("F학점입니다.");
		
		scanner.close();
	}

}
