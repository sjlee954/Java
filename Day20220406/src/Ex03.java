import java.util.Scanner;

public class Ex03 { //키보드로 두 점수를 입력 받아서, 총점과 평균을 출력한다.

	public static void main(String[] args) {
		System.out.println("점수를 입력하시오.>");
		
		Scanner scanner = new Scanner(System.in);
		
		String n1 = scanner.nextLine();
		String n2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		int sum = num1+num2;
		double aver = sum/2.0;
		
		System.out.println("합계: "+sum+" 평균: "+aver);
		
		scanner.close();
	}

}
