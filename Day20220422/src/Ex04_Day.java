import java.util.Scanner;

/*
일 월 화 수 목 금 토 일 -->랜덤하게 이 중 하나가 나오면
그에 맞는 소무자로 요일 입력 --> sunday, monday, tuesday, wednesday, thursday, friday, saturday
*/

public class Ex04_Day {

	public static void main(String[] args) {
		
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		String[] eng = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("해당 요일을 영어 소문자로 입력하세요.");
		
		int retry =0;
		int last = -1;
		int success=0;
		int fail=0;
		
		do { 
			int num=0;
			do {
				num = (int)(Math.random()*7);
			} while (num == last);
				last = num;
			
			while(true) {
				System.out.println(day[num]+"요일");
				String qus = sc.nextLine();
				
				if(qus.equals(eng[num])) break; //정답
				System.out.println("오답입니다.");
				fail++;
			}

			System.out.println("정답입니다.>>재도전(1) : 종료(0) :");
			success++;
			retry = sc.nextInt();
			sc.nextLine();
		
		} while (retry == 1);
		System.out.println("성공/실패 횟수: "+success+"/"+fail);
		System.out.println("프로그램 종료.");
		
	}

}
