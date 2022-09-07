import java.util.Scanner;

public class Calender_0 {

	public static void main(String[] args) {
		int year = 0;
		int month = 0;
		int start = 0;
		int end= 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도 입력: ");
		year = sc.nextInt();
		
		System.out.println("월 입력: ");
		month = sc.nextInt();
		
		System.out.println(year +"년도 "+month+"월\n"
				+"일\t월\t화\t수\t목\t금\t토");
		
		for(int i =1; i<start; i++) {
			System.out.println("\t");
		}
	
		  //전년도까지의 날짜수 총합
	    int total=(year-1)*365
	             +(year-1)/4 //4년마다 윤년
	             -(year-1)/100 //100년마다 윤년 제외
	             +(year-1)/400; //400년마다 윤년
	    int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
	    
	    for(int i=0;i<month-1;i++)
	       {
	           total += lastDay[i]; //전년도의 모든 일 수 합에다가 + 입력받은 이전 달까지의 일 수를 더한 값.
	                                //예) 스캐너에 2022년 4월을 입력하면 
	                                // (2021년까지의 일 수)+(3월달까지의 일 수)가 됨.  
	       }
	       //1일자 요일의 시작점을 찾아야함. 
	    total++; //저번달까지의 합에 +1을 한 것임.
	       
	    int day=total%7;
	    if (month ==1 || month ==3 || month ==5 || month ==7 || 
	    			month ==8 || month ==10 || month == 12) {	    	  
	    			end = 31;
	    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
	    			end = 30;
	    } else if (month == 2) {
	    			end = 28;
	    		}
	    
	     
	    for (int i=1;i<=end;i++) {
	    	if(i==1) {
	              for(int j=0;j<day;j++) {
	               System.out.print("\t");
	              } //안쪽 for문
	    	} //첫번째 if문
	        System.out.print(i+"\t");
	        day++;
	    	if (day == 7) {
	    		day = 0;
	    		System.out.println();
	    	} //두번째 if문

	    }// 바깥 for문
	     
		
	} //main 끝
	
}
