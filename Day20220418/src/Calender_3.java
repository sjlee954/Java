import java.util.Scanner;

public class Calender_3 {

	public static void main(String[] args) {
		
		int year = 0;
		int month = 0;
		int week = 0;
		int day = 0;
		int i = 0;	// i는 반복문 사용 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		year = sc.nextInt();
		System.out.print("월 입력 : ");
		month = sc.nextInt();
		
		System.out.println(year+"년도 " + month+"월");
		
		String[] weekend = {"일", "월", "화", "수", "목", "금", "토"};
		for (i = 0; i < weekend.length; i++) {
			System.out.print(weekend[i] + "\t");
		}
		System.out.println();
		
		// 각 달에 대한 날짜 저장
		int[] last = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((year%4==0 && year%100!=0) || year%400==0) {
			last[1] = 29;
		} else {
			last[1] = 28;
		}
//     						  4년마다 윤년	  100년마다 윤년 제외	  400년마다 윤년
		day = ((year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400)+1;	// +1 : 1월부터 12월에 해당하는 모든 날짜(day)를
																			//  모두 1씩 당겨서 출력한다
		/*
		 * (+1)이 필요한 이유
		 * ex) 2022년도 5월 출력(단, 1일은 토요일이 아닌 일요일이다.)
		 * 
		 * => +1이 없을 경우							=> +1을 해줄 경우
		 * 
		일	월	화	수	목	금	토				일	월	화	수	목	금	토
								1				1	2	3	4	5	6	7
		2	3	4	5	6	7	8				8	9	10	11	12	13	14
		9	10	11	12	13	14	15				15	16	17	18	19	20	21
		16	17	18	19	20	21	22				22	23	24	25	26	27	28
		23	24	25	26	27	28	29				29	30	31
		30	31
		
		(+1)을 사용할 경우, 5월 달력의 경우 토요일로 출력되었던 1일이 한 칸 당겨져서 일요일로 출력된다.
		(+1일부터 31일까지 모두 한 칸씩 당겨져서 출력된다.)
		
		<월	 화	수	목	금	토	일> :  (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400
		<일	 월	화	수	목	금	토> :  ((year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400)+1
		 */
		
		for (i = 0; i < month-1; i++) {
			day+=last[i]; 	//전년도의 모든 일 수 합에다가 + 입력받은 이전 달까지의 일 수를 더한 값.
							//예) 스캐너에 2022년 4월을 입력하면 
							// (2021년까지의 일 수)+(3월달까지의 일 수)가 됨.  
		}
		week=day%7;		// 구하고자 하는 달의 시작일
		
		for (i = 0; i < week; i++) {
			System.out.print("\t");		// 1일 시작 전 공백
		}
		
		for (i = 1; i <= last[month-1]; i++) {
			System.out.print(i + "\t");		// i를 입력한 달의 일수만큼 출력
			week++;	
			if (week%7==0) {				// 토요일이 지날 경우
				System.out.println();		// 줄 바꾸기
			}
		}
	}

}
