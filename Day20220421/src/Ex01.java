import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
//		int max = num1;
//		
//		if (num2 > max) 
//			max = num2;
//		
//		if (num3 > max) 
//			max = num3;
//		
//		System.out.println(max);
		
		System.out.println("------------------------------");
		int max = num1;
		int tmp=0;
		
		if (num2 > max) { 
			tmp = max;
			max = num2;
			num2 = tmp;
			if (num3 > max) {
				tmp = max;
				max = num3;
				num3 = tmp;
			}
		}
		if (num3 > num2) {
			tmp = num3;
			num3 = num2;
			num2 = tmp;
		}
		
		System.out.println(max+","+num2+","+num3);
		sc.close();
	}

}
