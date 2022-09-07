import java.util.Scanner;

public class Ex02 {	//if문사용해서 다섯개의 정수를 입력받아 가장 큰 수를 출력하는 프로그램 작성.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, max =0;
		String tmp;
		
		System.out.println("정수 5회 입력 ");
		
		for(int i=0; i<5 ; i++) {
			tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			if(max < num ) 
				max = num;
			
		} //end of for
		System.out.println("최댓값 : "+max);
	             
	             
//			if (num1>num2 && num1>num3 && num1>num4 && num1>num5) {
//				max = num1;
//			} else if (num2>num1 && num2>num3 && num2>num4 && num2>num5) {
//				max = num2;
//			} else if (num3>num1 && num3>num2 && num3>num4 && num2>num5) {
//				max = num3;
//			} else if (num4>num1 && num4>num2 && num4>num3 && num4>num5) {
//				max = num4;
//			} else if (num5>num1 && num5>num2 && num5>num3 && num5>num4) {
//				max = num5;
//			 	
//			}
			System.out.println(max);
		}
	}


