import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요.>");
		
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		
		switch(month) {
		case 3: //스위치문은 딱 떨어져야함 
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8: //이렇게 한줄로 간략하게 쓸 수도 있다.
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default:  //생략가능
		case 12: case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다.");
			
			//디폴트를 맨아래로 내려서 쓸 수 도 있음 12,1,2 케이스는 위에와 같이
			
		}
		
		sc.close();
	}

}
