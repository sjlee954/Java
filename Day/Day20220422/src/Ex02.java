import java.util.Scanner;

public class Ex02 { //해당 월의 영어 단어를 입력하는 프로그램

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] monthString = {
								"January", "February", "March", "April", "May", "June",
								"July", "August", "September", "October", "November", "December"
								};
		
		System.out.println("해당 월의 영어 단어를 입력하세요.");
		System.out.println("첫 글자는 대문자,이후는 소문자로 입력");
		
		int retry=0;
		int last = -1; //이전 월
		
		do {
			
			int month=(int)((Math.random()*12)); //0<= <12
				if (month == last) {
					month=(int)((Math.random()*12));
				}
				
			while(true) {
				System.out.println((month+1)+"월");
				String qus = sc.nextLine();
				
				if(qus.equals(monthString[month])) break; //정답
				System.out.println("오답입니다.");
			}
			
			System.out.println("정답입니다.>>재도전(1) : 종료(0) :");
			last = month;
			retry = sc.nextInt();
			sc.nextLine();
			
		}while(retry == 1);
		System.out.println("프로그램 종료.");
	}

}
