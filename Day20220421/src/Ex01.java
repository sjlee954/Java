import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max = num1;
		
		if (num2 > max) 
			max = num2;
		
		if (num3 > max) 
			max = num3;
		
		System.out.println("max: "+max);
		
		System.out.println("------------------------------");
		int tmp=0;
		
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
		
		System.out.println(num1+","+num2+","+num3);
		sc.close();
	}

}
