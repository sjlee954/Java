import java.util.Scanner;

public class Ex02 {

	static int num1, num2, num3;  //정적변수, 클래스 변수 >>class안에서 공용 가능.

	public static void main(String[] args) {
		
		input();
		Calc();
		output();
		
		
	}
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력>>");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sc.close();
	}

	static void Calc() {
		int tmp =0;
		if (num2 > num1) { 
			tmp = num1;
			num1 = num2;
			num2 = tmp;
			if (num3 > num1) {
				tmp = num1;
				num1 = num3;
				num3 = tmp;
			}
		}
		if (num3 > num2) {
			tmp = num3;
			num3 = num2;
			num2 = tmp;
		}
	}
	static void output() {
		
		System.out.println(num1+","+num2+","+num3);
		
	}

}
